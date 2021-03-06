<%@ page import="com.womai.shop.manage.front.SystemManager" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/resource/common_html_meat.jsp"%>
<%@ include file="/manage/system/common.jsp"%>
<%@ include file="/resource/common_html_validator.jsp"%>
<script type="text/javascript">
	$(function() {
		$("#title").focus();
	});

	function onSubmit() {
		if ($.trim($("#name").val()) == "") {
			alert("名称不能为空!");
			$("#name").focus();
			return false;
		}
	}
</script>
<style>
	.leftTD_css{
		width: 100px;
		text-align: right;
	}
	#insertOrUpdateMsg{
		border: 0px solid #aaa;margin: 0px;position: fixed;top: 0;width: 100%;
		background-color: #d1d1d1;display: none;height: 30px;z-index: 9999;font-size: 18px;color: red;
	}
</style>
</head>

<body>
	<div class="navbar navbar-inverse" >
		<div id="insertOrUpdateMsg">
			<s:property value="#session.insertOrUpdateMsg"/>
			<%request.getSession().setAttribute("insertOrUpdateMsg", "");//列表页面进行编辑文章的时候,需要清空信息 %>
		</div>
	</div>
	
	<input type="hidden" value="<s:property value="e.catalogID"/>" id="catalogID"/>
	<s:form action="attribute" namespace="/manage" theme="simple" id="form">
		<s:hidden name="e.pid" />
		<table class="table table-bordered">
			<tr style="background-color: #dff0d8">
				<td colspan="2" style="background-color: #dff0d8;text-align: center;">
					<strong>属性编辑</strong>
					<s:if test="e.pid==0">
						<span class="badge badge-important">商品属性</span>&nbsp;<strong>
					</s:if>
					<s:else>
						<span class="badge badge-success">商品参数</span>&nbsp;<strong>
					</s:else>
				</td>
			</tr>
			<tr style="display: none;">
				<td>id</td>
				<td><s:hidden name="e.id" label="id" /></td>
			</tr>
			<tr>
				<td class="leftTD_css">分类目录</td>
				<td style="text-align: left;">
					<!-- 
					<input id="cc" class="easyui-combotree" name="e.catalogID" value="<s:property value="e.catalogID"/>"
					data-options="url:'<%=request.getContextPath() %>/manage/catalog/catalog!getRootWithTreegrid.action?e.type=p',method:'get',required:false" 
					>
				(注意：只能选择子目录。)
					 -->
				
					<%
					application.setAttribute("catalogs", SystemManager.catalogs);
					%>
					<select onchange="catalogChange(this)" name="e.catalogID" id="catalogSelect" data-rule="required;select;">
						<option></option>
						<s:iterator value="#application.catalogs">
							<option pid="0" value="<s:property value="id"/>"><font color='red'><s:property value="name"/></font></option>
							<s:iterator value="children">
								<option value="<s:property value="id"/>">&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="name"/></option>
							</s:iterator>
						</s:iterator>
					</select><br>(请选择子类别)
				</td>
			</tr>
			<tr>
				<td class="leftTD_css">名称</td>
				<td style="text-align: left;"><s:textfield name="e.name" data-rule="required;name;length[1~20];" 
						id="name" /></td>
			</tr>
			<tr>
				<td class="leftTD_css">顺序</td>
				<td style="text-align: left;"><s:textfield name="e.order1"  
						id="order1" /></td>
			</tr>
			<tr style="background-color: #dff0d8">
				<td>
					<input type="button" onclick="addAttribute();" value="增加属性" class="btn btn-warning"/>
				</td>
				<td style="text-align: center;">
					<s:if test="e.id=='' or e.id==null">
<%-- 						<s:submit method="insert" value="新增" cssClass="btn btn-primary"/> --%>
<%-- 						<s:a method="insert" cssClass="btn btn-success"> --%>
<!-- 							<i class="icon-plus-sign icon-white"></i> 新增 -->
<%-- 						</s:a> --%>
						<button method="attribute!insert.action" class="btn btn-success">
							<i class="icon-ok icon-white"></i> 新增
						</button>
					</s:if> 
					<s:else>
<%-- 						<s:submit method="insert" value="保存" cssClass="btn btn-primary"/> --%>
<%-- 						<s:a method="insert" cssClass="btn btn-success"> --%>
<!-- 							<i class="icon-ok icon-white"></i> 保存 -->
<%-- 						</s:a> --%>
						<button method="attribute!insert.action" class="btn btn-success">
							<i class="icon-ok icon-white"></i> 保存
						</button>
					</s:else>
<%-- 					<s:submit method="back" value="返回" cssClass="btn btn-inverse"/> --%>
				</td>
			</tr>
			
			<!-- 母体 -->
			<tr id="cloneTR" style="display:none;">
				<td class="leftTD_css">名称</td>
				<td style="text-align: left;">
					<s:textfield name="e.attrNames" placeholder="请输入属性名称"/>
					<span style="margin-left:150px;"></span> 显示顺序：<s:textfield number="y" name="e.order1List" placeholder="请输入属性显示的顺序" value="0" size="5" maxlength="5"/>
				</td>
			</tr>
				
			<s:if test="e.attrList!=null">
				<s:iterator value="e.attrList" var="item" status="i">
					<s:if test="#i.index==0"><!-- 第一个不能删除 -->
						<tr class="pclass">
							<td class="leftTD_css">名称</td>
							<td style="text-align: left;">
								<s:textfield name="e.attrNames0" id="attrNames0" value="%{name}" data-rule="required;attrNames0;length[1~20];"/>
								<s:textfield name="e.idList0" id="idList0" value="%{id}" data-rule="required;idList0;length[1~20];" cssStyle="display:none;"/>
								<span style="margin-left:150px;"></span> 显示顺序：<s:textfield number="y" name="e.order1List0" id="order1List0" value="%{order1}" size="5" maxlength="5" data-rule="required;integer;order1List0;length[1~5];"/>
							</td>
						</tr>
					</s:if>
					<s:else>
						<tr class="pclass">
							<td class="leftTD_css">名称</td>
							<td style="text-align: left;">
								<s:textfield name="e.attrNames" value="%{name}"/>
								<s:textfield name="e.idList" value="%{id}" cssStyle="display:none;"/>
								<span style="margin-left:150px;"></span> 显示顺序：<s:textfield number="y" name="e.order1List" id="order1List" value="%{order1}" size="5" maxlength="5" data-rule="required;integer;order1List;length[1~5];"/>
							</td>
						</tr>
					</s:else>
				</s:iterator>
			</s:if>
			<s:else>
				<tr class="pclass">
					<td class="leftTD_css">名称</td>
					<td style="text-align: left;">
						<s:textfield name="e.attrNames0" id="attrNames0" data-rule="required;attrNames0;length[1~20];" placeholder="请输入属性名称"/>
						<span style="margin-left:150px;"></span> 显示顺序：<s:textfield number="y" name="e.order1List0" id="order1List0" size="5" maxlength="5" data-rule="required;order1List0;integer;length[1~5];" placeholder="请输入属性显示的顺序"/>
					</td>
				</tr>
			</s:else>
		</table>
	</s:form>

<script type="text/javascript">
	$(function(){
		selectDefaultCatalog();
		
		var ccc = $("#insertOrUpdateMsg").html();
		console.log("insertOrUpdateMsg="+insertOrUpdateMsg);
		if(ccc!='' && ccc.trim().length>0){
			$("#insertOrUpdateMsg").slideDown(1000).delay(1500).slideUp(1000);
		};
	});
	
	function addAttribute(){
		for(var i=0;i<10;i++){
			var cc = $("#cloneTR").clone();
			$("tr[class=pclass]:last").after(cc.show());//.find("input");//.attr("data-rule","");
			cc.find("input[type=button]").show();
		}
	}
	
	function removeThis(t){
		$(t).parent().parent().remove();
		return false;
	}
	
	function catalogChange(obj){
		var _pid = $(obj).find("option:selected").attr("pid");
		console.log("_pid="+_pid);
		if(_pid==0){
			alert("不能选择大类!");
			selectDefaultCatalog();
			return false;
		}
	}
	
	function selectDefaultCatalog(){
		var _catalogID = $("#catalogID").val();
		console.log("_catalogID = " + _catalogID);
		if(_catalogID==0){
			//console.log("_catalogID2 = " + _catalogID);
			$("#catalogSelect").prop("value","");
		}else{
			$("#catalogSelect").prop("value",_catalogID);
		}
	}
	
	//键盘按下的时候对字符进行检查，只能是数字
	$("input[number=y]").keydown(function(event) {
		var key = event.keyCode ? event.keyCode : event.which;
		//console.log("key="+key+",value="+_obj.val()+"isNaN="+isNaN(_obj.val())+",IsNum="+IsNum(_obj.val()));
		if ((key >= 48 && key <= 57) || key==8) {
		//if (IsNum(_obj.val())) {
			var _obj = $(this);
			console.log(">>>_obj.val()="+_obj.val());
			//库存字符检查
			if($.trim(_obj.val())=='' || parseInt(_obj.val())<=0){
				_obj.val("1");
			}
			//checkStockFunc();
			return true;
		} else {
			return false;
		}
	});
</script>

</body>
</html>

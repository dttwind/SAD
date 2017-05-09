<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查询页面</title>
</head>
<body>
<h3>查询结果：</h3>

<table width="640" border="1">
		<tr>
			<td>serialNumber</td>
			<td>price</td>
			<td>builder</td>
			<td>model</td>
			<td>type</td>
			<td>backWood</td>
			<td>topWood</td>			
		</tr>
		<s:iterator value="#session.guitarlistt" id="guitar">
		<tr>
			<td><s:property value="#guitar.serialNumber" /></td>
			<td><s:property value="#guitar.price" /></td>
			<td><s:property value="#guitar.builder" /></td>
			<td><s:property value="#guitar.model" /></td>
			<td><s:property value="#guitar.type" /></td>
			<td><s:property value="#guitar.backWood" /></td>
			<td><s:property value="#guitar.topWood" /></td>			
		</tr>
		</s:iterator>
</table>

</body>
</html>

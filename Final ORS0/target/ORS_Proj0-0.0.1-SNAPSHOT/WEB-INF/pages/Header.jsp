
<%@page import="in.co.sunrays.project0.dto.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
.navbar-nav>li>a, .navbar-brand {
	padding-top: 5px !important;
	padding-bottom: 0 !important;
	height: 38px;
	font-size: 13.2px;
}

.navbar {
	min-height: 28px !important;
}

.bg-custom-1 {
	background-color: #85144b;
}

.bg-custom-2 {
	background-image: linear-gradient(15deg, #13547a 0%, #80d0c7 100%);
}
</style>
<meta charset="ISO-8859-1">
<title>Header</title>

</head>

<nav class="navbar navbar-expand-sm navbar-light bg-custom-2">
	<div class="container-fluid">
		<a class="navbar-brand" href="<c:url value="/Welcome"/>"> <img
			style="float: right;" width="65" height="35" alt="" title="Home"
			src='<c:url value="http://localhost:8080/ORS_Proj0/resources/img/customLogoT.png"></c:url>'>
		</a> &nbsp;&nbsp;<a class="icon ion-md-home"
			href="<c:url value="/Welcome"/>"
			style="font-size: 20px; color: black;" title="Home"> </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">

				<c:if test="${not empty sessionScope.user}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"><i class="icon ion-md-clipboard"></i> <s:message
								code="label.marksheet" /></a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<c:if test="${sessionScope.user.roleId == 1}">
								<a class="dropdown-item"
									href="<c:url value="/ctl/Marksheet/Marksheet"/>"><s:message
										code="label.addmarksheet" /></a>
								<div class="dropdown-divider"></div>
							</c:if>
							<a class="dropdown-item"
								href="<c:url value="/ctl/Marksheet/GetMarksheet"/>"><s:message
									code="label.getmarksheet" /></a> <a class="dropdown-item"
								href="<c:url value="/ctl/Marksheet/Search"/>"><s:message
									code="label.marksheetlist" /></a> <a class="dropdown-item"
								href="<c:url value="/ctl/Marksheet/MarksheetMeritList"/>"><s:message
									code="label.marksheetmeritlist" /></a>
						</div></li>
					<c:if test="${sessionScope.user.roleId == 1}">
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/College/College"/>"> <i
								class="icon ion-md-business"></i> <s:message
									code="label.addcollege" /></a></li>

						<li class="nav-item"><a class="nav-link"
							href='<c:url value="/ctl/User/User"></c:url>'> <i
								class="icon ion-md-contact"></i> <s:message code="label.adduser" /></a>
						</li>

						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Role/Role"/>"><i
								class="icon ion-md-eye"></i> <s:message code="label.addrole" /></a></li>
					</c:if>
					<c:if
						test="${sessionScope.user.roleId == 3 || sessionScope.user.roleId == 1}">
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Student/Student"/>"><i
								class="icon ion-md-person"></i> <s:message
									code="label.addstudent" /></a></li>

						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Course/Course"/>"><i
								class="icon ion-md-school"></i> <s:message
									code="label.addcourse" /></a></li>

						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Subject/Subject"/>"><i
								class="icon ion-md-copy"></i> <s:message code="label.addsubject" /></a>
						</li>

						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Faculty/Faculty"/>"><i
								class="icon ion-md-man"></i> <s:message code="label.addfaculty" /></a>
						</li>
					</c:if>
					<c:if
						test="${sessionScope.user.roleId == 3 || sessionScope.user.roleId == 1 || sessionScope.user.roleId == 5}">
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/ctl/Timetable/Timetable"/>"><i
								class="icon ion-md-calendar"></i> <s:message
									code="label.addtimetable" /></a></li>
					</c:if>
					<c:if test="${sessionScope.user.roleId == 1}">
					</c:if>
				</c:if>
				<li class="nav-item dropdown border-left "><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"><i class="icon ion-md-person"></i> <c:if
							test="${not empty sessionScope.user}">
							<c:set var="name" value="${sessionScope.user.firstName}" />
							<c:set var="role" value='${sessionScope["role"]}' />
							<b><c:out value=" Hi,${name}(${role})"></c:out></b>
						</c:if> <c:if test="${empty sessionScope.user}">
							<s:message code="label.hiGuest"></s:message>
						</c:if> </a>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="navbarDropdown">
						<c:if test="${not empty sessionScope.user}">
							<a class="dropdown-item"
								href="<c:url value="/ctl/User/Myprofile" />"><i
								class="icon ion-md-contacts"></i> <s:message
									code="label.myprofile" /></a>
							<a class="dropdown-item"
								href="<c:url value="/ctl/User/ChangePassword"/>"><i
								class="icon ion-md-key"></i> <s:message
									code="label.changepassword" /></a>
							<a class="dropdown-item"
								href="<c:url value="/resources/doc/index.html"/>" target="blank"><i
								class="icon ion-md-document"></i> <s:message
									code="label.javadoc" /></a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="<c:url value="/Login"/>"><i
								class="icon ion-md-log-out"></i> <s:message code="label.logout" /></a>
						</c:if>
						<c:if test="${empty sessionScope.user}">
							<a class="dropdown-item" href='<c:url value="/Login"></c:url>'>
								<s:message code="label.login" />
							</a>

							<a class="dropdown-item"
								href='<c:url value="/UserRegistration"></c:url>'> <s:message
									code="label.signup" /></a>
						</c:if>
					</div></li>
			</ul>
		</div>
	</div>
</nav>
<br> &nbsp;
<a style="font-size: 13px;" class="text-dark bg-info circle p-1"
	href='<c:url value="?lang=en" ></c:url>'><strong>English</strong></a>
<a style="font-size: 13px;" class="text-dark bg-success circle p-1"
	href="<c:url value="?lang=hi"></c:url>"><strong>हिन्दी</strong></a>
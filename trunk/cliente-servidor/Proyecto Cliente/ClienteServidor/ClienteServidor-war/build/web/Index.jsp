<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Index
    Created on : 13/06/2010, 15:12:53
    Author     : justomiguel
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div style="height: 120px; left: 0px; top: 0px; position: absolute; width: 456px">
                            <jsp:directive.include file="Header.jspf"/>
                        </div>
                        <webuijsf:image binding="#{Index.image1}" id="image1" style="left: 240px; top: 192px; position: absolute" url="/resources/login.png"/>
                        <webuijsf:textField binding="#{Index.textField2}" id="textField2" style="left: 384px; top: 264px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Index.button1_action}" binding="#{Index.button1}" id="button1"
                            style="height: 24px; left: 503px; top: 360px; position: absolute; width: 72px" text="Login"/>
                        <webuijsf:label binding="#{Index.nombreLabel}" id="nombreLabel" style="color: white; left: 312px; top: 264px; position: absolute" text="Nombre"/>
                        <webuijsf:label id="label3" style="color: white; left: 312px; top: 312px; position: absolute" text="Password"/>
                        <webuijsf:passwordField binding="#{Index.passwordField1}" id="passwordField1" style="left: 384px; top: 312px; position: absolute" valueChangeListenerExpression="#{Index.passwordField1_processValueChange}"/>
                        <webuijsf:label binding="#{Index.label4}" id="label4"
                            style="color: rgb(255, 0, 0); font-size: 14px; left: 144px; top: 432px; position: absolute; width: 670px" text="Se ha producido un error en tu consulta, esto se debe a datos erroneos intenta nuevamente...."/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

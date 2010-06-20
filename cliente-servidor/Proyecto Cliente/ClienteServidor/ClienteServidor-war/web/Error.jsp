<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Error
    Created on : 13/06/2010, 23:54:37
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
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="Header.jspf"/>
                        </div>
                        <webuijsf:label id="label1"
                            style="color: rgb(255, 0, 0); font-family: 'Geneva','Arial','Helvetica',sans-serif; font-size: 36px; left: 24px; top: 168px; position: absolute" text="Error!..."/>
                        <webuijsf:button actionExpression="#{Error.button1_action}" id="button1"
                            style="height: 24px; left: 431px; top: 288px; position: absolute; width: 95px" text="Aceptar"/>
                        <webuijsf:label id="label2" style="left: 24px; top: 240px; position: absolute; width: 481px" text="Se ha producido un error en la consulta realizada, por favor intente nuevamente...."/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

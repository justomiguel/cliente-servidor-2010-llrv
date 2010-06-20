<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Exito
    Created on : 15/06/2010, 00:15:59
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
                            style="color: green; font-family: 'Arial','Helvetica',sans-serif; font-size: 24px; left: 72px; top: 216px; position: absolute; width: 814px" text="Los Datos fueron Procesados Correctamente!...."/>
                        <webuijsf:button actionExpression="#{Exito.button1_action}" id="button1"
                            style="height: 24px; left: 623px; top: 288px; position: absolute; width: 144px" text="Aceptar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

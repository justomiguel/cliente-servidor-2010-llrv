<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : AgregarLocalidades
    Created on : 15/06/2010, 14:20:16
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
                            <webuijsf:label id="label7" text="Label"/>
                        </div>
                        <div style="left: 0px; top: 168px; position: absolute">
                            <jsp:directive.include file="leftMenu.jspf"/>
                        </div>
                        <webuijsf:textField binding="#{AgregarLocalidades.textField3}" id="textField3" style="left: 624px; top: 264px; position: absolute"/>
                        <webuijsf:textField binding="#{AgregarLocalidades.textField4}" id="textField4" style="left: 624px; top: 288px; position: absolute"/>
                        <webuijsf:label id="label1" style="position: absolute; left: 504px; top: 240px" text="Nombre"/>
                        <webuijsf:label id="label3" style="height: 24px; left: 504px; top: 264px; position: absolute; width: 120px" text="Codigo Postal"/>
                        <webuijsf:label id="label4" style="height: 24px; left: 504px; top: 288px; position: absolute; width: 120px" text="Codigo de Area"/>
                        <webuijsf:button actionExpression="#{AgregarLocalidades.button1_action}" binding="#{AgregarLocalidades.button1}" id="button1"
                            style="height: 24px; left: 695px; top: 360px; position: absolute; width: 116px" text="Agregar"/>
                        <webuijsf:label id="label5" style="border-bottom: solid #30cf38 1px; left: 240px; top: 192px; position: absolute; width: 576px" text="Ingrese los datos de la loaclidad"/>
                        <webuijsf:label id="label2" style="left: 504px; top: 216px; position: absolute" text="id"/>
                        <webuijsf:textField binding="#{AgregarLocalidades.textField1}" id="textField1" style="left: 624px; top: 216px; position: absolute"/>
                        <webuijsf:textField binding="#{AgregarLocalidades.textField2}" id="textField2" style="left: 624px; top: 240px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : BLocalidades
    Created on : 14/06/2010, 21:38:08
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
                        <div style="left: 0px; top: 0px; position: absolute"></div>
                        <div style="left: 0px; top: 168px; position: absolute">
                            <jsp:directive.include file="leftMenu.jspf"/>
                        </div>
                        <webuijsf:label id="label1" style="left: 240px; top: 192px; position: absolute; width: 360px" text="Ingrese el nombre de la localidad o seleccionela de la lista:"/>
                        <webuijsf:label binding="#{BLocalidades.errorlabel1}" id="errorlabel1"
                            style="color: red; height: 24px; left: 288px; top: 312px; position: absolute; width: 288px" text="No se han podido cargar las localidades..."/>
                        <webuijsf:dropDown binding="#{BLocalidades.dropDown1}" id="dropDown1" items="#{BLocalidades.dropDown1DefaultOptions.options}"
                            style="left: 816px; top: 240px; position: absolute" valueChangeListenerExpression="#{BLocalidades.dropDown1_processValueChange}" width="150"/>
                        <webuijsf:textField binding="#{BLocalidades.textField1}" id="textField1" style="left: 600px; top: 192px; position: absolute"
                            validatorExpression="#{BLocalidades.textField1_validate}" valueChangeListenerExpression="#{BLocalidades.textField1_processValueChange}"/>
                        <webuijsf:button actionExpression="#{BLocalidades.button2_action}" binding="#{BLocalidades.button1}" id="button1"
                            style="height: 24px; left: 767px; top: 192px; position: absolute; width: 144px" text="Buscar"/>
                        <webuijsf:label binding="#{BLocalidades.label2}" id="label2"
                            style="color: red; height: 22px; left: 240px; top: 240px; position: absolute; width: 550px" text="No se ha encontrado la localidad verifique  los datos e intente nuevamente o seleccione una localidad de la lista"/>
                        <webuijsf:label binding="#{BLocalidades.label3}" id="label3"
                            style="height: 24px; left: 672px; top: 288px; position: absolute; width: 264px" text="Los datos se han elminado correctamente..."/>
                        <webuijsf:label binding="#{BLocalidades.label4}" id="label4"
                            style="height: 24px; left: 600px; top: 360px; position: absolute; width: 192px" text="¿Realmente desea eliminar? "/>
                        <webuijsf:button actionExpression="#{BLocalidades.button1_action}" binding="#{BLocalidades.button2}" id="button2"
                            style="height: 24px; left: 815px; top: 360px; position: absolute; width: 143px" text="Eliminar"/>
                        <webuijsf:image id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/header.png"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

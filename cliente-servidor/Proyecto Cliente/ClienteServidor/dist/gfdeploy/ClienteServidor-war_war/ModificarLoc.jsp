<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : ModificarLoc
    Created on : 15-jun-2010, 7:50:08
    Author     : tress
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
                        <div style="left: 0px; top: 168px; position: absolute">
                            <jsp:directive.include file="leftMenu.jspf"/>
                        </div>
                        <webuijsf:label id="label1" style="left: 240px; top: 192px; position: absolute; width: 360px" text="Ingrese el nombre de la localidad o seleccionela de la lista:"/>
                        <webuijsf:label binding="#{ModificarLoc.errorLoc}" id="errorLoc"
                            style="color: red; height: 24px; left: 288px; top: 312px; position: absolute; width: 288px" text="No se han podido cargar las localidades..."/>
                        <webuijsf:dropDown binding="#{ModificarLoc.dropDown1}" id="dropDown1" items="#{ModificarLoc.dropDown1DefaultOptions.options}"
                            style="left: 816px; top: 240px; position: absolute" valueChangeListenerExpression="#{ModificarLoc.dropDown1_processValueChange}" width="150"/>
                        <webuijsf:textField binding="#{ModificarLoc.busqueda}" id="busqueda" style="left: 600px; top: 192px; position: absolute"
                            validatorExpression="#{ModificarLoc.busqueda_validate}" valueChangeListenerExpression="#{ModificarLoc.busqueda_processValueChange}"/>
                        <webuijsf:button actionExpression="#{ModificarLoc.button1_action}" binding="#{ModificarLoc.button1}" id="button1"
                            style="height: 24px; left: 767px; top: 192px; position: absolute; width: 144px" text="Buscar"/>
                        <webuijsf:label binding="#{ModificarLoc.findError}" id="findError"
                            style="color: red; height: 22px; left: 240px; top: 240px; position: absolute; width: 550px" text="No se ha encontrado la localidad verifique  los datos e intente nuevamente o seleccione una localidad de la lista"/>
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="Header.jspf"/>
                        </div>
                        <webuijsf:label binding="#{ModificarLoc.labelNombre}" id="labelNombre"
                            style="height: 24px; left: 648px; top: 312px; position: absolute; width: 48px" text="Nombre:"/>
                        <webuijsf:label binding="#{ModificarLoc.labelCodPost}" id="labelCodPost"
                            style="left: 648px; top: 336px; position: absolute; width: 94px" text="Codigo Postal"/>
                        <webuijsf:label binding="#{ModificarLoc.labelCodAr}" id="labelCodAr" style="left: 648px; top: 360px; position: absolute; width: 120px" text="Codigo de Area"/>
                        <webuijsf:textField binding="#{ModificarLoc.nombreLoc}" id="nombreLoc" style="left: 768px; top: 312px; position: absolute"/>
                        <webuijsf:textField binding="#{ModificarLoc.codPost}" id="codPost" style="left: 768px; top: 336px; position: absolute"/>
                        <webuijsf:textField binding="#{ModificarLoc.codAr}" id="codAr" style="left: 768px; top: 360px; position: absolute"/>
                        <webuijsf:button actionExpression="#{ModificarLoc.button2_action}" binding="#{ModificarLoc.button2}" id="button2"
                            style="height: 24px; left: 839px; top: 432px; position: absolute; width: 101px" text="Guardar"/>
                        <webuijsf:label binding="#{ModificarLoc.numerosError}" id="numerosError"
                            style="color: rgb(255, 0, 51); height: 24px; left: 720px; top: 384px; position: absolute; width: 310px" text="Los datos no pueden ser caracteres alfabeticos"/>
                        <webuijsf:label binding="#{ModificarLoc.idlabel}" id="idlabel" style="left: 648px; top: 288px; position: absolute" text="id"/>
                        <webuijsf:textField binding="#{ModificarLoc.id}" id="id" style="left: 768px; top: 288px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

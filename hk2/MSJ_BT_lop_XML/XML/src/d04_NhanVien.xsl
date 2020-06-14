<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : d04_NhanVien.xsl
    Created on : April 11, 2020, 10:53 AM
    Author     : PC
    Description:
        Mo ta transfrom cho file d04 _nhanvien.xml
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>tranfrom</title>
            </head>
            <body>
                <h2>Danh Sach Nhan Vien</h2>
                <hr/>
                
                <xsl:apply-templates select="Congty/Bophan/NhanVien"/>
                
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="NhanVien">
        <p>
            Ma so:<xsl:value-of select="@id"/><br/>
            Ten:<xsl:value-of select="TenNV"/><br/>
            Gioi Tinh:<xsl:value-of select="GioiTinh"/><br/>
            Luong:<xsl:value-of select="Luong"/><br/>
        </p>
    </xsl:template>
</xsl:stylesheet>

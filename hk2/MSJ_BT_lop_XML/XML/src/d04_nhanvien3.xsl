<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : d04_nhanvien2.xsl
    Created on : April 11, 2020, 11:29 AM
    Author     : PC
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>tranfrom 2</title>
                <link href="nhanvien.css" rel="stylesheet"></link>
                <style>
                    *{ background-color: aliceblue}
                    H2{font-weight:Bold; background-color: yellow;color: red;}
                    b{color:green; background-color:yellow}
                </style>
            </head>
            <body>
                <h2>Danh sach nhan vien</h2>
                <hr/>
                <xsl:for-each select="//Congty"><!--// la dau gop lai (lay het) -->
                    <B>Company:<xsl:value-of select="TenCongty"/><br/>
                       Address:<xsl:value-of select="DiaChi"/>
                    </B>
                </xsl:for-each>
                <xsl:for-each select="//Bophan">
                    <div>
                        <p>Ten bon phan:<xsl:value-of select="TenBP"/>
                            <br/>
                            Truong phong:<xsl:value-of select="TruongPhong"/>
                        </p>
                        <table>
                            <tr>
                                <th>So TT</th>
                                <th>Ma so</th>
                                <th>Ho ten</th>
                                <th>Gioi tinh</th>
                                <th>Luong</th>
                            </tr>
                            <xsl:for-each select="NhanVien">
                                <xsl:sort select="Luong" data-type="number" order="descending"/><!--sap xep lai-->
                                <tr>
                                    <td>
                                        <xsl:number select="position()" format="1."/><!--tao them cot soTT: format ='1.';'a.';'I.'-->
                                    </td>
                                    <td>
                                        <xsl:value-of select="@id"/>            <!--thuoc tinh them @...-->
                                    </td>
                            
                                    <td>
                                        <xsl:value-of select="TenNV"/>
                                    </td>
                            
                                    <td>
                                        <xsl:value-of select="GioiTinh"/>
                                    </td>
                            
                                    <td>
                                        <xsl:value-of select="Luong"/>
                                    </td> 
                                </tr> 
                            </xsl:for-each>
                        </table>
                    </div>
                </xsl:for-each>
                
                
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>

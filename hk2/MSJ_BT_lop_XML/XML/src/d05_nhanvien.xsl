<?xml version="1.0" encoding="UTF-8"?>

<!--

-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>nhanvien</title>
                <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" />
            </head>
            <body>
                <div class="container">
                  
   
                    <h2>Danh sach nhan vien</h2>
                    <hr/>
                        
                    <xsl:for-each select="//Bophan">
                        <div>
                            <p>Ten bon phan:<xsl:value-of select="TenBP"/>
                                <br/>
                                Truong phong:<xsl:value-of select="TruongPhong"/>
                            </p>
                            <table class="table table-bordered table-striped table-hover">
                                <thead>
                                    <tr>
                                        <th>So TT</th>
                                        <th>Ma so</th>
                                        <th>Ho ten</th>
                                        <th>Gioi tinh</th>
                                        <th>Luong</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <xsl:for-each select="NhanVien">
                                        <xsl:sort select="Luong" data-type="number" order="descending"/>
                                        <tr>
                                            <td>
                                                <xsl:number select="position()" format="1."/><!--tao them cot soTT: format ='1.';'a.';'I.'-->
                                            </td>
                                            <td>
                                                <xsl:value-of select="@id"/>
                                            </td>
                            
                                            <td>
                                                <xsl:value-of select="TenNV"/>
                                            </td>
                            
                                            <td>
                                                <xsl:value-of select="GioiTinh"/>
                                            </td>
                            
                                            <td style="text-align: right;">
                                                <xsl:value-of select="Luong"/>
                                            </td>
                            
                                        </tr> 
                                    </xsl:for-each>
                                </tbody>
                    
                                <tfoot>
                                    <tr>
                                        <td colspan="4">Quy Luong</td>
                                        <td style="text-align: right;">
                                            <xsl:value-of select="sum(.//Luong)"/>
                                        </td>
                                    </tr>
                                </tfoot>
                            </table>
                            
                        </div>
                    </xsl:for-each>
                    <h3>Tong ket</h3>
                    <p>
                        <b>Tong Quy Luong Cong Ty: </b> 
                        <xsl:value-of select="sum(//Luong)" />
                    </p>
                    <p>
                        <b>Tong so nhan vien: </b> 
                        <xsl:value-of select="count(//NhanVien)" /> 
                        <br/>
                        <b>So nhan vien nam</b> : 
                        <xsl:value-of select="count(//NhanVien[GioiTinh='Nam'])" /> 
                        <br/>
                        <b>So nhan vien nu</b> : 
                        <xsl:value-of select="count(//NhanVien[GioiTinh='Nu'])" /> 
                        <br/>
                    </p>
                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>

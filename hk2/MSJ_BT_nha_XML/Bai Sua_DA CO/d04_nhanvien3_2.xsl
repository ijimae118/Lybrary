<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>transform 2</title>
                <link href="nhanvien.css" rel="stylesheet" />
            </head>
            <body>
                <h2>Danh sach nhan vien</h2>
                <hr/>
                
                
                <xsl:for-each select="//Bophan">
                    <div>
                        <p>Ten bo phan: <xsl:value-of select="TenBP" /> 
                            <br/>
                            Truong phong: <xsl:value-of select="TruongPhong" />
                        </p>

                        <table>
                            <tr>
                                <th>So TT </th>
                                <th>Ma so</th>
                                <th>Ho ten</th>
                                <th>Gioi tinh</th>
                                <th>Luong</th>
                            </tr>
                            <xsl:for-each select="NhanVien">
                                <xsl:sort select="Luong" data-type="number" 
                                          order="descending" />
                                <tr>
                                    <td>
                                        <xsl:number select="position()" format="1." 
                                                     />
                                    </td>
                                    <td> 
                                        <xsl:value-of select="@id" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="TenNV" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="GioiTinh" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="Luong" />
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

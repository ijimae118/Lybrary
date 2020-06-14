<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>transform 2</title>
            </head>
            <body>
                <h2>Danh sach nhan vien</h2>
                <hr/>
                
                <table>
                    <tr>
                        <th>Ma so</th>
                        <th>Ho ten</th>
                        <th>Gioi tinh</th>
                        <th>Luong</th>
                    </tr>
                    <xsl:for-each select="//NhanVien">
                        <tr>
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
                
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>

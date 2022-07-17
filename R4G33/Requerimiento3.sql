/*Los materiales que no han sido importados, menos comprados en los proyectos, mostrando
cuántas compras se han hecho de cada uno. Desempatar alfabéticamente.*/

SELECT mc.Nombre_Material, mc.Importado, COUNT(c.Cantidad) AS No_Compras
FROM Compra c
INNER JOIN MaterialConstruccion mc
ON c.ID_MaterialConstruccion=mc.ID_MaterialConstruccion
WHERE Importado='No'
GROUP BY Nombre_Material
ORDER BY No_Compras ASC, Nombre_Material DESC
LIMIT 5;

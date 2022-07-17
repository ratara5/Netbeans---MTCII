/* ¿Cuáles son los 15 proyectos ordenados donde más se gasta dinero se ha invertido en
compra de materiales? */
SELECT p.ID_Proyecto,p.Clasificacion,SUM(mc.Precio_Unidad*c.Cantidad) AS Gasto_Compras,p.Serial
FROM Proyecto p
INNER JOIN Compra c
ON p.ID_Proyecto=c.ID_Proyecto
INNER JOIN MaterialConstruccion mc
ON c.ID_MaterialConstruccion=mc.ID_MaterialConstruccion
GROUP BY c.ID_Proyecto
ORDER BY Gasto_Compras DESC
LIMIT 15;


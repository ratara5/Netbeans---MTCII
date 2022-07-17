/*Bancos ordenados de menor a mayor según el área de construcción promedio de los
proyectos que respaldan*/

SELECT p.Banco_Vinculado, AVG(t.Area_Max) AS Area_Promedio
FROM Proyecto p
INNER JOIN Tipo t
ON p.ID_Tipo=t.ID_Tipo
GROUP BY Banco_Vinculado;
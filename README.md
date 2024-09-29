# ProyectoSO_Hurtado_Ruiz

Proyecto 1: Productores de Computadoras 

	Problemática  
Actualmente el mercado gamer está en constante crecimiento. Por lo que  muchas empresas nacionales están buscando estudiar el mercado internacional  para empezar a vender computadoras. Para ello han contratado a los estudiantes  de la corte actual de Sistemas Operativos para realizar una simulación y conocer  que equipos son más viables vender que otros.  
Las empresas Dell, HP, MSI y Apple han sido seleccionadas para el estudio.  Pero por cuestiones de tiempo solo se realizarán las comparaciones de rendimiento  entre una y la otra.  
El objetivo de la simulación es conocer las ganancias potenciales con la  producción y ventas de computadoras, contrastadas con los gastos operativos que  implican mantener las compañías en funcionamiento. Además, las empresas no  quieren ceder ante la competencia, así que han solicitado comparar el rendimiento  de la compañía con el de una compañía rival, para así determinar si es rentable  realizar la inversión. 
Para lograrlo, los desarrolladores de software deben presentar un  Dashboard en donde se puedan visualizar los datos solicitados de forma dinámica  y creativa, a su vez de permitir la manipulación del número de trabajadores en cada  compañía, para así conocer la combinación óptima de los mismos.
Lineamientos generales  
1. Trabajadores de la compañía: las compañías requieren personal  especializado en cada área, al que se le debe pagar un sueldo por hora.  También, cada grupo de trabajadores cuenta con un espacio en el almacén,  el cual tiene una capacidad limitada para guardar elementos de las  computadoras ya terminados, si la sección del almacén está llena no se  pueden producir más elementos.  
Cada compañía cuenta con: último número del carnet del desarrollador +  12 trabajadores  
Ejemplo: integrante con carnet 0299, tendrá 9+12 = 21 empleados Ese  número de trabajadores abarcan las áreas que se encuentran a  continuación y a los ensambladores finales  
a. Productores de placa base: Estos empleados cobran $20 la hora de  trabajo (trabajen o no trabajen) y pueden generar:  
i. Último número de carnet en intervalo 0 <= X < 3  
1 placa base cada 2 días  
ii. Último número de carnet en intervalo 3 <= X < 6  
1 placa base cada 3 días  
iii. Último número de carnet en intervalo 6 <= X <= 9  
1 placa base cada 4 días  
Su almacén tiene una capacidad máxima de 25 placas base 
b. Productores de CPUs: Estos empleados cobran $26 la hora de  trabajo (trabajen o no trabajen) y pueden generar:  
i. Último número de carnet en intervalo 0 <= X < 3  
1 CPU cada 2 días  
ii. Último número de carnet en intervalo 3 <= X < 6  
1 CPU cada 3 días 
iii. Último número de carnet en intervalo 6 <= X <= 9  
1 CPU cada 4 días  
Su almacén tiene una capacidad máxima de 20 CPU  
c. Productores de Memoria RAM: Estos empleados cobran $40 la hora  de trabajo (trabajen o no trabajen) y pueden generar:  
i. Último número de carnet en intervalo 0 <= X < 3  
3 Memoria RAM cada día  
ii. Último número de carnet en intervalo 3 <= X < 6  
2 Memoria RAM cada día  
iii. Último número de carnet en intervalo 6 <= X <= 9  
1 Memoria RAM cada día  
Su almacén tiene una capacidad máxima de 55 Memoria RAM 
d. Productores de Fuente de alimentación: Estos empleados cobran  $16 la hora de trabajo (trabaje o no trabaje) y pueden generar:  
i. Último número de carnet en intervalo 0 <= X < 5  
3 Fuente de alimentación cada día  
ii. Último número de carnet en intervalo 5 <= X <= 9  
5 Fuente de alimentación cada día 
Su almacén tiene una capacidad máxima de 35 fuentes de alimentación 
e. Productores de tarjetas gráficas: Estos empleados cobran $34 la  hora de trabajo (trabaje o no trabaje) y pueden generar:  
i. Último número de carnet en intervalo 0 <= X < 5  
1 tarjetas gráficas cada 3 días  
ii. Último número de carnet en intervalo 5 <= X <= 9 
1 tarjetas gráficas cada 2 días  
Su almacén tiene una capacidad máxima de 10 tarjetas gráficas 
2. Ensambladores: Este tipo de empleados accede al almacén, toma las partes  de la computadora necesarias (dadas según la empresa con la que se  trabaje) y ensambla una computadora terminado, esto le toma 2 días y  cobra 50$ la hora (trabaje o no trabaje). No hay máximo de computadoras  terminadas que se puedan almacenar en el almacén, ya que estos cuentan  con su espacio preferencial  
Adicionalmente, cada empresa tiene sus políticas especiales para crear  computadoras con tarjeta gráfica, así que cada X computadoras que se  ensamblen, se debe crear un computadora con tarjeta gráfica. Esta política, en  conjunto con los elementos necesarios para crear cada computadora se  encuentran anexas al final del documento  
Se deben poder distribuir el total de empleados de la compañía, entre  los 5 tipos de trabajadores y los ensambladores de las computadoras.  
Considere que todos los empleados trabajan 24 horas al día  
3. Project Manager: Solo hay uno por cada compañía, y su trabajo es registrar  el paso de los días. Tiene acceso a un contador con los días restantes para  la entrega de los computadoras terminados. Sin embargo, al PM se le conoce por  su fanatismo al anime (Está al día con One Piece), a tal punto que las  primeras 16 horas del día logra ver anime a escondidas. Cada intervalo de  30 minutos ve anime, y los siguientes 30 minutos trabaja revisando el  avance del proyecto, siguiendo el ciclo durante las primeras 16 horas del día.  Las últimas 8 horas del día las invierte cambiando el contador con los días  restantes para la entrega. El PM cobra $40 la hora esté trabajando o esté  viendo anime.  
4. Director: Solo hay uno por compañía y se encarga de revisar cuántos días 
restan para la entrega de las computadoras. El director siempre cobra $60 la  hora  
a. Si el contador marca 0 días restantes, el director se encarga de enviar  todos los computadoras ya creados a las distribuidoras, lo que le toma 24  horas. Una vez terminado registra la nueva ganancia de los  computadores enviados y reinicia el contador de los días restantes para  entregar las computadoras, lo cual le toma un tiempo despreciable.  
b. Si el contador marca 1 día o más restantes, entonces el director  trabajará con labores administrativas durante todo el día, Además,  escogerá una hora aleatoria del día en la que revisará lo que está  haciendo el PM por 35 minutos, si durante ese intervalo el director  descubre al PM viendo anime, le colocará una falta y descontará  $100 de su sueldo  
Requerimientos funcionales  
- Deben hacer uso de Hilos/Threads y Semáforos/Semaphores para plantear  su solución a la problemática  
- Se debe asegurar Exclusión mutua cuando se intente actualizar los valores  del almacén. 
- Cada compañía debe contar en todo momento con un trabajador de cada  tipo como mínimo. 
- Cada empresa requiere conocer los datos más relevantes sobre la simulación  de su estudio, esto incluye: ganancias en bruto, costos operativos y  utilidad total del estudio. Se debe mostrar esta información a través de un  Dashboard ordenado y creativo  
- Bono 10%: Mostrar en un mismo gráfico la utilidad con respecto al tiempo de  los estudios de las 2 empresas que se están comparando. Puede hacerse  uso de librerías de gráficos para Java  
- Se debe hacer uso de una interfaz gráfica que permita observar y controlar 
la simulación, se debe observar en todo momento:  
o La cantidad de cada tipo de trabajadores y de ensambladores  o La cantidad disponible de cada elemento de computadora en el almacén o La cantidad máxima de elementos para cada elemento del almacén. o La cantidad de computadoras listas para entregar de cada tipo:  estándar y con tarjeta gráfica. 
o Los días que faltan para la entrega  
o Qué está haciendo el Project Manager  
o Qué está haciendo el Director  
o La cantidad de faltas del Project Manager y el dinero total descontado  de su salario  
- La simulación debe permitir en tiempo de ejecución:  
o Intercambiar los tipos de trabajadores y ensambladores dentro del  estudio, respetando la cantidad máxima y mínima de empleados 
- DESDE LA INTERFAZ se le debe poder indicar al programa los siguientes  parámetros, para que sean escritos en un archivo (TXT, CSV o JSON) y  utilizados en la próxima simulación:  
o Duración en segundos de un día dentro de la simulación 
o Cantidad de días entre las entregas de las computadoras a las  distribuidoras, es decir, deadline de entrega  
o Cantidad inicial de cada tipo de trabajadores y de ensambladores  
Consideraciones  
- El proyecto puede ser elaborado máximo por 2 personas (3 si alguno queda  solo) 
- Solo se permite el uso de librerías para la realización del Bono de 10%  - No se permite uso de librerías para estructuras de datos, como ArrayList  
- Para entregar el proyecto deben enviar el repositorio de GitHub donde lo  trabajen a fin de validar el trabajo individual de cada estudiante. Es  importante que el primer commit sea un proyecto vacío. Se enviará el enlace  del repositorio a andres.martin@correo.unimet.edu.ve antes de las 11:59 pm  del 10 de octubre del 2024.
 
- Tener un repositorio en GitHub es obligatorio.  
- Para la entrega, junto al código, se debe entregar un informe donde se detalle la funcionalidad de las clases y métodos más importantes del  proyecto, no hace falta documentar todo el código. Además, los estudiantes  deben realizar un análisis de los Dashboards generados para sacar  conclusiones sobre los diferentes estudios de animación que se llevarán a  cabo, como, por ejemplo: cuál es más rentable, cuál es la distribución óptima  de empleados, cuál gasta menos en personal, etc.  
- El día siguiente, 11 de octubre, se realizará un interrogatorio por turnos en  el salón habitual. Todos los integrantes del equipo deben estar presentes  (preferiblemente con alguna de sus computadoras).  
- Se recibirán proyectos al correo anteriormente indicado hasta el día 11 de  octubre a hasta la 10:00 AM con una penalización de 1 punto por cada hora que transcurra, después de ese momento, no será  corregido ningún proyecto. 	
- Los proyectos sin interfaz gráfica, serán calificados en base a 0 (cero). - Los proyectos sin repositorio en GitHub, serán calificados en base a 0 (cero).  
- Los alumnos que no asistan al interrogatorio, serán calificados en base a 0  (cero). 
- Los programas que “no corran”, serán calificados en base a 0 (cero).  
- Los proyectos que sean iguales o parecidos, serán calificados en base a 0  (cero).  
- Los proyectos que no sean realizados en Java serán calificados en base a 0  (cero)  
- Cada integrante deberá aportar un 50% 土 10% del código. De no ser así su  nota final será afectada por un factor multiplicativo. Esto haría que la nota final  del integrante del grupo que trabajó menos sea  
Factor Multiplicativo = (Líneas de código agregadas de la persona + Lineas de  código eliminadas de la persona) / [(Líneas de código agregadas totales +  Líneas de código eliminadas totales) / 2] 
Nota Final = Nota Obtenida * Factor Multiplicativo 
Comentarios  
- Si se tiene cualquier duda o circunstancia, puede preguntar a través del grupo  de WhatsApp, en las prácticas o por mensaje privado al preparador  
- La creatividad será tomada en cuenta al igual que el aporte individual al  proyecto. 
Especificaciones de las compañías


Apple:  
- Computador estándar:  
Para ensamblar una computadora necesitan de:
2 Placas base 
1 CPU 
4 Memorias RAM 
4 Fuentes de alimentación 
Ganancia al vender computador: $100K 
- Computadora con tarjeta gráfica: 

Después de crear 5 computadoras, la siguiente tendrá 2 tarjetas gráficas 

Ganancia al sacar el computadora: $150K  
DELL:  
- Computador estándar:  
Para ensamblar una computadora necesitan de:
1 Placas base 
5 CPU 
6 Memorias RAM 
5 Fuentes de alimentación 
Ganancia al vender computador: $80K 

- Computadora con tarjeta gráfica: 
Después de crear 3 computadoras, la siguiente tendrá 1 tarjeta gráfica.
Ganancia al sacar el computadora: $120K  
HP:  
- Computador estándar: 
Para ensamblar una computadora necesitan de:  
1 Placas base 
1 CPU 
2 Memorias RAM 
4 Fuentes de alimentación 
Ganancia al vender computador: $90K
- Computadora con tarjeta gráfica: 
Después de crear 2 computadoras, la siguiente tendrá 3 tarjetas gráficas
Ganancia al sacar el computadora: $140K  
MSI:  
- Computador estándar:  

Para ensamblar una computadora necesitan de  
2 Placas base 
3 CPU 
4 Memorias RAM 
6 Fuentes de alimentación 
Ganancia al vender computador: $180K 

- Computadora con tarjeta gráfica: 
Después de crear 6 computadoras, la siguiente tendrá 5 tarjetas gráficas
Ganancia al sacar el computadora: $250K 

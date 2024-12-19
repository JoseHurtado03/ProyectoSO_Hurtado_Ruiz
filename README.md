# ProyectoSO_Hurtado_Ruiz

## Proyecto 1: Simulación de Productores de Computadoras

### Introducción
El mercado gamer está en constante crecimiento, llevando a muchas empresas nacionales a explorar el mercado internacional. Este proyecto tiene como objetivo desarrollar una simulación para determinar la viabilidad de producir y vender computadoras en dicho mercado. Dos empresas (Dell y HP) han sido seleccionadas para este estudio.

La simulación evaluará:
- Ganancias potenciales por producción y venta.
- Costos operativos.
- Rentabilidad en comparación con una empresa rival.

El resultado final será un **dashboard interactivo** que permitirá manipular variables clave, como el número de trabajadores, para encontrar la combinación óptima.

---

### Estructura del Proyecto

#### Trabajadores y Roles
Cada compañía contará con un equipo de trabajadores distribuidos en distintas áreas productivas. La cantidad de trabajadores será igual al último dígito del carnet del desarrollador + 12.

**1. Áreas Productivas:**
- **Productores de Placa Base:**
  - **Salario:** $20/hora
  - **Producción:**
    - Último dígito del carnet:
      - 0-2: 1 placa base cada 2 días.
      - 3-5: 1 placa base cada 3 días.
      - 6-9: 1 placa base cada 4 días.
  - **Capacidad máxima del almacén:** 25 placas.

- **Productores de CPUs:**
  - **Salario:** $26/hora
  - **Producción:**
    - Último dígito del carnet:
      - 0-2: 1 CPU cada 2 días.
      - 3-5: 1 CPU cada 3 días.
      - 6-9: 1 CPU cada 4 días.
  - **Capacidad máxima del almacén:** 20 CPUs.

- **Productores de Memoria RAM:**
  - **Salario:** $40/hora
  - **Producción:**
    - Último dígito del carnet:
      - 0-2: 3 memorias RAM/día.
      - 3-5: 2 memorias RAM/día.
      - 6-9: 1 memoria RAM/día.
  - **Capacidad máxima del almacén:** 55 memorias RAM.

- **Productores de Fuente de Alimentación:**
  - **Salario:** $16/hora
  - **Producción:**
    - Último dígito del carnet:
      - 0-4: 3 fuentes/día.
      - 5-9: 5 fuentes/día.
  - **Capacidad máxima del almacén:** 35 fuentes.

- **Productores de Tarjetas Gráficas:**
  - **Salario:** $34/hora
  - **Producción:**
    - Último dígito del carnet:
      - 0-4: 1 tarjeta cada 3 días.
      - 5-9: 1 tarjeta cada 2 días.
  - **Capacidad máxima del almacén:** 10 tarjetas gráficas.

- **Ensambladores:**
  - **Salario:** $50/hora
  - **Funciones:**
    - Ensamblan computadoras en 2 días usando los recursos del almacén.
    - No hay límite de computadoras terminadas en el almacén.

**2. Roles Adicionales:**
- **Project Manager (PM):**
  - **Salario:** $40/hora
  - **Funciones:**
    - Alterna entre ver anime (30 min) y trabajar (30 min) durante las primeras 16 horas del día.
    - Dedica las últimas 8 horas a ajustar el contador de días restantes.

- **Director:**
  - **Salario:** $60/hora
  - **Funciones:**
    - Si el contador marca 0 días restantes, envía las computadoras a distribución y registra las ganancias (24 horas de trabajo).
    - Si el contador marca 1 día o más, realiza tareas administrativas y supervisa al PM.

---

### Requerimientos Técnicos
- Uso obligatorio de **hilos/threads** y **semáforos/semaphores**.
- Exclusión mutua al actualizar valores del almacén.
- Dashboard interactivo con visualización en tiempo real de:
  - Número y tipo de trabajadores.
  - Disponibilidad y capacidad del almacén.
  - Computadoras listas para entrega (estándar y con tarjeta gráfica).
  - Actividades actuales del PM y del Director.
  - Faltas del PM y deducciones salariales.
- Ajustes dinámicos durante la simulación, como redistribuir trabajadores y ensambladores.
- Configuración inicial desde una interfaz gráfica, con parámetros guardados en formatos TXT, CSV o JSON.

---

### Políticas por Compañía
Cada compañía tiene requisitos y ganancias específicas para los dos tipos de computadoras:

**Dell:**
- **Computadora Estándar:**
  - Recursos: 1 placa, 5 CPU, 6 RAM, 5 fuentes.
  - Ganancia: $80K.
- **Computadora con Tarjeta Gráfica:**
  - Cada 3 computadoras: +1 tarjeta gráfica.
  - Ganancia: $120K.

**HP:**
- **Computadora Estándar:**
  - Recursos: 1 placa, 1 CPU, 2 RAM, 4 fuentes.
  - Ganancia: $90K.
- **Computadora con Tarjeta Gráfica:**
  - Cada 2 computadoras: +3 tarjetas gráficas.
  - Ganancia: $140K.

---

### Entregables
1. **Repositorio GitHub:**
   - Primer commit: proyecto vacío.
   - Último commit antes de la fecha límite.

2. **Informe Técnico:**
   - Documentación de clases y métodos principales.
   - Explicación de la funcionalidad del sistema.
   - Instrucciones para ejecutar el proyecto.

3. **Fecha de Entrega:**
   - **10 de octubre de 2024, 11:59 PM.**
   - Penalización: 1 punto por hora de retraso hasta las 10:00 AM del 11 de octubre.
   - Proyectos entregados después no serán evaluados.

---

### Más Información
Las compañías MSI y Apple también podrían ser consideradas en futuras iteraciones, ya que presentan políticas y estrategias de producción diferentes:

**Apple:**
- **Computadora Estándar:**
  - Recursos: 2 placas, 1 CPU, 4 RAM, 4 fuentes.
  - Ganancia: $100K.
- **Computadora con Tarjeta Gráfica:**
  - Cada 5 computadoras: +2 tarjetas gráficas.
  - Ganancia: $150K.

**MSI:**
- **Computadora Estándar:**
  - Recursos: 2 placas, 3 CPU, 4 RAM, 6 fuentes.
  - Ganancia: $180K.
- **Computadora con Tarjeta Gráfica:**
  - Cada 6 computadoras: +5 tarjetas gráficas.
  - Ganancia: $250K.


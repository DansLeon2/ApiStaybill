# 🍷 StayBill - Hospitality & Automated Invoicing System

Plataforma integral cliente-servidor para la gestión hotelera, administración de estancias y emisión automatizada de facturas y comprobantes electrónicos.

---

## 📌 Evidencias del Proceso de Diseño e Integración

> **Espacios reservados para capturas del proceso:**  
> Puedes colocar aquí las capturas de pantalla de Stitch, la terminal de MCP o la API.

### 🖼️ Captura 1: Conexión con Google Stitch MCP y Pantallas del Proyecto
<!-- Reemplaza la ruta 'docs/screenshots/stitch-screens.png' con tu archivo de imagen o enlace -->
![Conexión MCP Google Stitch y Catálogo de Pantallas](docs/screenshots/stitch-screens.png)
*Figura 1: Conexión e inspección de las 13 pantallas del proyecto `6028705216808543694` en Google Stitch.*

---

### 🖼️ Captura 2: Sistema de Diseño (Paleta Vino & Gris) y Prompts de UI
<!-- Reemplaza la ruta 'docs/screenshots/design-system-vino-gris.png' con tu archivo de imagen o enlace -->
![Sistema de Diseño Vino y Gris](docs/screenshots/design-system-vino-gris.png)
*Figura 2: Especificación visual de tokens de diseño, tipografía y estilo sobrio Vino & Gris para la interfaz.*

---

### 🖼️ Captura 3: Arquitectura Backend y Endpoints REST (Spring Boot)
<!-- Reemplaza la ruta 'docs/screenshots/backend-api-endpoints.png' con tu archivo de imagen o enlace -->
![Arquitectura Backend y Endpoints](docs/screenshots/backend-api-endpoints.png)
*Figura 3: Lógica del backend en Spring Boot, modelo de datos en PostgreSQL y endpoint `POST /api/auth/registro`.*

---

## 🏗️ Arquitectura de la Solución

El proyecto sigue un patrón cliente-servidor desacoplado con proxy inverso:

```
[ Cliente Web: React 19 + Vite ] 
                │
                ▼ (HTTPS / Puerto 443)
     [ Proxy Inverso: Caddy ]
       ├── /api/*   ──► [ Backend: Spring Boot 4 + Java 21 (:8080) ] ──► [ PostgreSQL (:5432) ]
       └── /*       ──► [ Frontend: Servidor Vite / Nginx (:5173) ]
```

---

## 📂 Estructura del Repositorio

```
staybill/
├── staybill/                     # Módulo Backend (Spring Boot 4 + Java 21)
│   ├── src/main/java/            # Controladores, Servicios, Entidades y Repositorios
│   ├── src/main/resources/       # application.properties (PostgreSQL)
│   ├── pom.xml                   # Dependencias Maven (JPA, Security, WebMVC)
│   ├── design.md                 # Documento maestro de diseño y catálogo de endpoints
│   └── stitch-design-system.md   # Tokens de diseño y prompts para Google Stitch
│
├── frontend-app-ing-web/         # Módulo Frontend (React 19 + Vite)
│   ├── src/
│   │   ├── api/                  # Cliente Axios centralizado con interceptores
│   │   ├── index.css             # Variables CSS globales (Tokens Vino & Gris)
│   │   └── App.jsx
│   └── package.json
│
├── .agents/skills/               # Skills instaladas para desarrollo frontend
│   ├── vercel-react-best-practices/ # 70 reglas de rendimiento Vercel
│   └── ui-ux-pro-max/            # Inteligencia de diseño UI/UX y accesibilidad
│
├── PROJECT_STATUS.md             # Tablero de control de avance por fases
└── README.md                     # Documentación principal
```

---

## 🚀 Hitos Realizados en esta Sesión

1. **Diseño de la API Backend (`staybill/design.md`):**
   - Especificación técnica del endpoint operativo `POST /api/auth/registro`.
   - Proyección de endpoints para login con JWT, perfiles, catálogo de estancias y facturación.
   - Diagramas de arquitectura y entidad-relación (ERD) en Mermaid.

2. **Integración con Google Stitch MCP:**
   - Conexión al servidor MCP de Stitch con API Key y consulta al proyecto `6028705216808543694`.
   - Mapeo de 13 pantallas registradas (`Login`, `Registro`, `Dashboard`, `Estancias`, `Facturas`, `2FA`, etc.).

3. **Sistema de Diseño (Vino & Gris):**
   - Sustitución de tonos azules por una paleta de **Vino / Burgundy** (`#881337`, `#9F1239`, `#4C0519`) y **Escala de Grises** (`#18181B`, `#52525B`, `#E4E4E7`, `#F4F4F5`).
   - Creación de prompts listos para Stitch y tokens CSS nativos en `src/index.css`.

4. **Skills para el Frontend:**
   - `vercel-react-best-practices`: Reglas de rendimiento, re-renders y optimización de bundles.
   - `ui-ux-pro-max`: Pautas de usabilidad, contraste mínimo 4.5:1 y micro-interacciones.

5. **Plan de Trabajo y Control de Versiones:**
   - Plan de trabajo por fases y creación de `PROJECT_STATUS.md`.
   - Limpieza de `.gitignore` para prevenir la subida de temporales, cachés de Python y variables `.env`.

---

## 🛠️ Requisitos e Instalación

### Backend (`staybill`)
```bash
cd staybill
# Asegúrate de tener PostgreSQL corriendo en el puerto 5432 (base de datos: staybill)
./mvnw spring-boot:run
```

### Frontend (`frontend-app-ing-web`)
```bash
cd frontend-app-ing-web
npm install
npm run dev
```
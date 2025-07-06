# EducaGestor360

    Proyecto de aplicación educativa Android.

    ## Configuración del Proyecto

    1.  Clona el repositorio: `git clone https://github.com/TuNombreDeUsuario/EducaGestor360.git`
    2.  Abre el proyecto en Android Studio.
    3.  Crea un archivo `local.properties` en la raíz del proyecto. Este archivo **no** se incluye en el control de versiones y es necesario para configuraciones locales y sensibles.
    4.  Añade las siguientes propiedades a tu `local.properties` (reemplaza los valores de ejemplo según sea necesario):
    5.  Sincroniza el proyecto con Gradle en Android Studio.

    ## Ambientes

    El proyecto está configurado para manejar diferentes ambientes a través de los Build Types de Gradle. Las configuraciones específicas (como URLs de API) se gestionan en el archivo `app/build.gradle.kts` y pueden leer valores desde `local.properties`.

    ### Ambiente de Desarrollo (`debug`)

    *   **Propósito:** Usado para el desarrollo diario y pruebas locales.
    *   **URL Base de API (Ejemplo):** `BuildConfig.API_BASE_URL` apuntará al valor definido para `debug` (ej. `https://tu.api.desarrollo.com/v1/` o el valor por defecto en `build.gradle.kts`).
    *   **Clave de API (Ejemplo):** Puede usar una clave de API específica para desarrollo/pruebas.
    *   **Logging HTTP:** Habilitado (`BuildConfig.LOG_HTTP_REQUESTS = true`).
    *   **Cómo seleccionar:** En Android Studio, ve a la pestaña "Build Variants" y selecciona "debug" como "Active Build Variant" para el módulo `app`.

    ### Ambiente de Pruebas / Release (`release`)

    *   **Propósito:** Usado para generar compilaciones que se asemejan más al entorno de producción, para pruebas de QA, o para la versión final de la aplicación.
    *   **URL Base de API (Ejemplo):** `BuildConfig.API_BASE_URL` apuntará al valor definido para `release` (ej. `https://tu.api.produccion.com/v1/` o el valor por defecto en `build.gradle.kts`).
    *   **Clave de API (Ejemplo):** Debería usar una clave de API de producción o un sistema seguro para manejarla.
    *   **Logging HTTP:** Deshabilitado (`BuildConfig.LOG_HTTP_REQUESTS = false`).
    *   **Minificación y Ofuscación:** Debería estar habilitado para `release` (ej. `isMinifyEnabled = true`).
    *   **Cómo seleccionar:** En Android Studio, ve a la pestaña "Build Variants" y selecciona "release" como "Active Build Variant" para el módulo `app`.

    ## Acceso a Datos y Servidores

    *   **API Principal:**
        *   **Desarrollo:** `[URL_DESARROLLO_AQUÍ]` (ej. la que definiste en `API_BASE_URL_DEBUG`)
        *   **Producción:** `[URL_PRODUCCION_AQUÍ]` (ej. la que definiste en `API_BASE_URL_RELEASE`)
        *   **Autenticación:** (Describe brevemente cómo se autentica la API, ej. "Token Bearer obtenido tras login", "Clave de API en cabeceras").
    *   **(Si usas Firebase u otros servicios BaaS):**
        *   **Firebase Project ID (Desarrollo):** `educagestor360-dev` (ejemplo)
        *   **Firebase Project ID (Producción):** `educagestor360-prod` (ejemplo)
        *   Describe cómo configurar los archivos `google-services.json` para cada ambiente si es necesario (esto es un poco más avanzado, a menudo implica diferentes módulos o carpetas de `src/debug/google-services.json` y `src/release/google-services.json`).

    ## Próximos Pasos de Configuración (Ejemplos)

    *   Integrar un cliente de red (Retrofit, Ktor).
    *   Configurar Inyección de Dependencias (Hilt) para proveer instancias de red y configuraciones.
    *   Definir modelos de datos (DTOs) para las respuestas de la API.

    

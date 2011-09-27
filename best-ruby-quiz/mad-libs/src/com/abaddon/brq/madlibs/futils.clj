(ns com.abaddon.brq.madlibs.futils
    (:import [org.apache.commons.io FileUtils]
             [java.io File]))

(defn obtener-historias [ruta]
    (let [archivos (FileUtils/listFiles (new File ruta) (into-array String (list "txt")) true)
         nombres-archivos (map (fn [x] (.getName x)) archivos)
         historias (map (fn [x] (FileUtils/readFileToString x)) archivos)]
         (zipmap nombres-archivos historias)))

(defn obtener-preguntas-de-historia [historia]
    (list "(Un Adjetivo)" "(Un Sustantivo)" "(Un nombre propio)"))


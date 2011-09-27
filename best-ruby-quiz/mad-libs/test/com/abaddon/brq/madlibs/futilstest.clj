(ns com.abaddon.brq.madlibs.futilstest
    (:use [com.abaddon.brq.madlibs.futils] :reload)
    (:use [clojure.test]))

(def folder-historias "./historias")
    
(deftest leer-folder-historias []
    ; Verifica que se esten leyendo las historias
    (is (= 3 (.size (obtener-historias folder-historias)))))

(deftest historias-debe-ser-un-mapa []
    (is (map? (obtener-historias folder-historias))))

(deftest debe-existir-la-historia-1 []
    (is (contains? (obtener-historias folder-historias) "historia1.txt")))

(deftest imprimir-llaves-historias []
    (doto (print "Historias:")
     (println (keys (obtener-historias folder-historias)))))

(deftest imprimir-historias []
    (let [historias (obtener-historias folder-historias)]
          (doseq [llave (keys historias)]
              (doto (println (str "Historia[" llave "]:" (get historias llave)))))))

(deftest debe-devolver-el-numero-correcto-de-preguntas-de-una-historia []
    (is (= 3 (.size (obtener-preguntas-de-historia "historia1.txt")))))

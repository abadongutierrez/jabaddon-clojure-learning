(ns problem-0002.core)

(defn sumar-dos-ultimos [x] (+ (second x) (first x)))

(defn fibonacci-seq-until [x]
    ; Obtiene la secuencia fibonacci inicando con (1 2) hasta
    ; que el siguiente elemento de la secuencia no pase de x
    (loop [seq-init (quote (2 1))]
        (if (> (sumar-dos-ultimos seq-init) x)
            (rseq (vec seq-init)) ; regresamos la version en reversa de la secuencia
            (recur (conj seq-init (sumar-dos-ultimos seq-init))))))

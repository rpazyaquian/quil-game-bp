(ns basic-game-test.core
  (:gen-class)
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup [])
(defn update [state])
(defn draw [state])

(defn make-sketch
  (q/defsketch basic-game-test
    :size [200 200]
    :setup setup
    :draw draw
    :update update
    :middleware [m/fun-mode]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (make-sketch))

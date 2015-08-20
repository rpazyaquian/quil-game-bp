(ns basic-game-test.core
  (:gen-class)
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (let [time (System/currentTimeMillis)]
    {:time time}))

(defn update [state])

(defn draw [state]
  (q/background 0))

(defn make-sketch []
  (q/sketch
    :title "basic"
    :size [200 200]
    :setup setup
    :draw draw
    :update update
    :features [:keep-on-top
               :exit-on-close]
    :middleware [m/fun-mode]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (make-sketch))

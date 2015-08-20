(ns basic-game-test.core
  (:gen-class)
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn draw-time [time]
  (q/fill 0)
  (q/text (str time) 10 10))

(defn setup []
  (let [time (System/currentTimeMillis)]
    {:time time}))

(defn update [state]
  (assoc state :time (System/currentTimeMillis)))

(defn draw [state]
  (q/background 255)
  (draw-time (:time state)))

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

(ns basic-game-test.core
  (:gen-class)
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn draw-time [time]
  (q/fill 0 0 0)
  (q/text (str time) 10 10))

(defn draw-time-delta [time-delta]
  (q/fill 255 0 0)
  (q/text (str time-delta) 10 30))

(defn setup []
  (let [time (System/currentTimeMillis)]
    {:time time
     :time-delta 0}))

(defn update [state]
  (let [time (System/currentTimeMillis)
        time-delta (- time (:time state))]
    (assoc state :time time :time-delta time-delta)))

(defn draw [state]
  (q/background 255 255 255)
  (draw-time (:time state))
  (draw-time-delta (:time-delta state)))

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

(ns basic-game-test.draw
  (:gen-class)
  (:require [quil.core :as q]))

(defn -draw-time [time]
  (q/fill 0 0 0)
  (q/text (str time) 10 10))

(defn -draw-time-delta [time-delta]
  (q/fill 255 0 0)
  (q/text (str time-delta) 10 30))

(defn draw-state [state]
  (-draw-time (:time state))
  (-draw-time-delta (:time-delta state)))

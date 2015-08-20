(ns basic-game-test.core
  (:gen-class)
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup [])
(defn update [state])
(defn draw [state])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

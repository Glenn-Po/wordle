(ns wordle.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.dom :as rdom]))
(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))


;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 "Welcome to Reagent"]])

(defn App []
  [:p "Am I connected?"])
;; -------------------------
;; Initialize app

(defn mount-root []
  (rdom/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))

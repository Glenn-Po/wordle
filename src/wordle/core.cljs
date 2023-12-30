(ns wordle.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.dom :as rdom]))
(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))


;; -------------------------
;; Views

(defn home-page []
  [:main [:div.heading [:img {:src "img/wordle.png" :height 100}] [:h2.title "Welcome to " [:b "Wordle"]]]
   [:div.body [:p "Get N+1 chances to guess an N-letter word, 3 <= N <= 12."]
    [:div.actions [:button "How to Play"] [:button "Play"]]]])


;; -------------------------
;; Initialize app

(defn mount-root []
  (rdom/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))

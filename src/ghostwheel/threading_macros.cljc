(ns ^:no-doc ghostwheel.threading-macros
  #?(:cljs (:require-macros ghostwheel.threading-macros)))

(defmacro *-> [& forms] `(~'-> ~@forms))
(defmacro *->> [& forms] `(~'->> ~@forms))
(defmacro *as-> [& forms] `(~'as-> ~@forms))
(defmacro *cond-> [& forms] `(~'cond-> ~@forms))
(defmacro *cond->> [& forms] `(~'cond->> ~@forms))
(defmacro *some-> [& forms] `(~'some-> ~@forms))
(defmacro *some->> [& forms] `(~'some->> ~@forms))

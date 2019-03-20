(ns ^:no-doc ghostwheel.core
  (:require [ghostwheel.unghost :refer [clean-defn]]))

(def => :ret)
(def | :st)
(def <- :gen)

(defmacro >defn [& forms] (clean-defn 'defn forms))
(defmacro >defn- [& forms] (clean-defn 'defn- forms))

(defn- cljs-env? [env] (boolean (:ns env)))

(defmacro ?
  [& forms]
  `(~(if (cljs-env? &env)
       'cljs.spec.alpha/nilable
       'clojure.spec.alpha/nilable)
    ~@forms))

(defmacro >fdef [& _] nil)
(defmacro after-check [& _] nil)
(defmacro check [& _] nil)

(defmacro |> [form] form)
(defmacro tr [form] form)

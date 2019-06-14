;; Copyright (c) George Lipov. All rights reserved.
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 2.0 (https://choosealicense.com/licenses/epl-2.0/)
;; which can be found in the file LICENSE at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns ^:no-doc ghostwheel.core
  #?(:cljs (:require-macros ghostwheel.core))
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

(defmacro |>
  ([expr]
   expr)
  ([label expr]
   expr))

(defmacro tr [& forms] `(|> ~@forms))

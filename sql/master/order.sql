-- Adminer 4.17.1 PostgreSQL 17.4 (Debian 17.4-1.pgdg120+2) dump

DROP TABLE IF EXISTS "order";
DROP SEQUENCE IF EXISTS order_id_seq;
CREATE SEQUENCE order_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1;

CREATE TABLE "public"."order" (
    "id" integer DEFAULT nextval('order_id_seq') NOT NULL,
    "customer_name" character varying(100) NOT NULL,
    CONSTRAINT "order_pkey" PRIMARY KEY ("id")
) WITH (oids = false);

INSERT INTO "order" ("id", "customer_name") VALUES
(1,	'ankur'),
(2,	'ambar'),
(3,	'arav'),
(4,	'bhavya'),
(5,	'aradhya');

-- 2025-02-27 17:44:04.343728+00
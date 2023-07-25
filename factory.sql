PGDMP     #    )                {            factory    15.3    15.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16655    factory    DATABASE     {   CREATE DATABASE factory WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE factory;
                postgres    false            �            1259    16694    models    TABLE     �   CREATE TABLE public.models (
    id_model integer NOT NULL,
    id_product integer,
    name_model character varying(35) NOT NULL,
    price money NOT NULL
);
    DROP TABLE public.models;
       public         heap    postgres    false            �            1259    16693    models_id_model_seq    SEQUENCE     �   CREATE SEQUENCE public.models_id_model_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.models_id_model_seq;
       public          postgres    false    217                       0    0    models_id_model_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.models_id_model_seq OWNED BY public.models.id_model;
          public          postgres    false    216            �            1259    16685    products    TABLE     s   CREATE TABLE public.products (
    id_product integer NOT NULL,
    name_product character varying(35) NOT NULL
);
    DROP TABLE public.products;
       public         heap    postgres    false            �            1259    16684    products_id_product_seq    SEQUENCE     �   CREATE SEQUENCE public.products_id_product_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.products_id_product_seq;
       public          postgres    false    215                       0    0    products_id_product_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.products_id_product_seq OWNED BY public.products.id_product;
          public          postgres    false    214            �            1259    16706    receipt    TABLE     �   CREATE TABLE public.receipt (
    id_receipt integer NOT NULL,
    id_model integer,
    date_receipt date,
    quantity integer,
    person character varying(35) NOT NULL,
    CONSTRAINT receipt_quantity_check CHECK ((quantity >= 0))
);
    DROP TABLE public.receipt;
       public         heap    postgres    false            �            1259    16705    receipt_id_receipt_seq    SEQUENCE     �   CREATE SEQUENCE public.receipt_id_receipt_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.receipt_id_receipt_seq;
       public          postgres    false    219                       0    0    receipt_id_receipt_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.receipt_id_receipt_seq OWNED BY public.receipt.id_receipt;
          public          postgres    false    218            p           2604    16697    models id_model    DEFAULT     r   ALTER TABLE ONLY public.models ALTER COLUMN id_model SET DEFAULT nextval('public.models_id_model_seq'::regclass);
 >   ALTER TABLE public.models ALTER COLUMN id_model DROP DEFAULT;
       public          postgres    false    217    216    217            o           2604    16688    products id_product    DEFAULT     z   ALTER TABLE ONLY public.products ALTER COLUMN id_product SET DEFAULT nextval('public.products_id_product_seq'::regclass);
 B   ALTER TABLE public.products ALTER COLUMN id_product DROP DEFAULT;
       public          postgres    false    215    214    215            q           2604    16709    receipt id_receipt    DEFAULT     x   ALTER TABLE ONLY public.receipt ALTER COLUMN id_receipt SET DEFAULT nextval('public.receipt_id_receipt_seq'::regclass);
 A   ALTER TABLE public.receipt ALTER COLUMN id_receipt DROP DEFAULT;
       public          postgres    false    219    218    219                      0    16694    models 
   TABLE DATA           I   COPY public.models (id_model, id_product, name_model, price) FROM stdin;
    public          postgres    false    217   !                  0    16685    products 
   TABLE DATA           <   COPY public.products (id_product, name_product) FROM stdin;
    public          postgres    false    215   �                  0    16706    receipt 
   TABLE DATA           W   COPY public.receipt (id_receipt, id_model, date_receipt, quantity, person) FROM stdin;
    public          postgres    false    219   V!                  0    0    models_id_model_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.models_id_model_seq', 10, true);
          public          postgres    false    216                       0    0    products_id_product_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.products_id_product_seq', 4, true);
          public          postgres    false    214                       0    0    receipt_id_receipt_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.receipt_id_receipt_seq', 8, true);
          public          postgres    false    218            x           2606    16699    models models_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.models
    ADD CONSTRAINT models_pkey PRIMARY KEY (id_model);
 <   ALTER TABLE ONLY public.models DROP CONSTRAINT models_pkey;
       public            postgres    false    217            z           2606    16721    models name_model 
   CONSTRAINT     R   ALTER TABLE ONLY public.models
    ADD CONSTRAINT name_model UNIQUE (name_model);
 ;   ALTER TABLE ONLY public.models DROP CONSTRAINT name_model;
       public            postgres    false    217            t           2606    16692 "   products products_name_product_key 
   CONSTRAINT     e   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_name_product_key UNIQUE (name_product);
 L   ALTER TABLE ONLY public.products DROP CONSTRAINT products_name_product_key;
       public            postgres    false    215            v           2606    16690    products products_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id_product);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    215            |           2606    16712    receipt receipt_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.receipt
    ADD CONSTRAINT receipt_pkey PRIMARY KEY (id_receipt);
 >   ALTER TABLE ONLY public.receipt DROP CONSTRAINT receipt_pkey;
       public            postgres    false    219            }           2606    16700    models models_id_product_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.models
    ADD CONSTRAINT models_id_product_fkey FOREIGN KEY (id_product) REFERENCES public.products(id_product);
 G   ALTER TABLE ONLY public.models DROP CONSTRAINT models_id_product_fkey;
       public          postgres    false    215    3190    217            ~           2606    16713    receipt receipt_id_model_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.receipt
    ADD CONSTRAINT receipt_id_model_fkey FOREIGN KEY (id_model) REFERENCES public.models(id_model);
 G   ALTER TABLE ONLY public.receipt DROP CONSTRAINT receipt_id_model_fkey;
       public          postgres    false    219    3192    217               �   x�M�;�@Dk�9 BK6�*.�a��$*
@�`#ʇ,'���b���=NhD����C�V�CO־�Ƙ�1�"�ڳ��t��\�h��7��(�g\���O��jM����.���ѱ4	�,�$��ݯ:�T���j��3
��)<���c��a��9H��sԼ�\#��57�}�/>�4��@���k9�����X         M   x�3�0��/�\l���ˈ�¬�.6^l��wa�1�%��2/컰�®�L8/,q@j��&�`� �V,         �   x�]�K�@D�5w3>�]<�ƅ�Ƶ�' *��r��٠t��Uu���3�k�k����+۸`ˋr�S��R�d�� �2o�d׬��"#h��;�x�|��ٔ��_Ȥu�E O,�č,��џ��xt<l�*.����m�g�}ܲ�-C~>SJ�Bqi�     
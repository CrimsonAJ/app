.class public final LV5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;)V
    .locals 0

    .line 1
    iput p1, p0, LV5/f;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LV5/f;->a:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final a(Lcom/google/crypto/tink/shaded/protobuf/a;)Ljava/lang/Object;
    .locals 17

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    move-object/from16 v3, p0

    .line 5
    .line 6
    iget v4, v3, LV5/f;->b:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lh6/Q;

    .line 14
    .line 15
    invoke-virtual {v1}, Lh6/Q;->B()Lh6/V;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Lh6/V;->z()Lh6/O;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v1}, Lh6/Q;->A()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    .line 32
    .line 33
    const-string v7, "HMAC"

    .line 34
    .line 35
    invoke-direct {v6, v5, v7}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lh6/Q;->B()Lh6/V;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lh6/V;->A()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eq v4, v2, :cond_4

    .line 51
    .line 52
    if-eq v4, v0, :cond_3

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    if-eq v4, v0, :cond_2

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-eq v4, v0, :cond_1

    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    if-ne v4, v0, :cond_0

    .line 62
    .line 63
    new-instance v0, Li6/m;

    .line 64
    .line 65
    new-instance v2, Ll4/s;

    .line 66
    .line 67
    const-string v4, "HMACSHA224"

    .line 68
    .line 69
    invoke-direct {v2, v4, v6}, Ll4/s;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v2, v1}, Li6/m;-><init>(Lf6/a;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 77
    .line 78
    const-string v1, "unknown hash"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_1
    new-instance v0, Li6/m;

    .line 85
    .line 86
    new-instance v2, Ll4/s;

    .line 87
    .line 88
    const-string v4, "HMACSHA512"

    .line 89
    .line 90
    invoke-direct {v2, v4, v6}, Ll4/s;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v2, v1}, Li6/m;-><init>(Lf6/a;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance v0, Li6/m;

    .line 98
    .line 99
    new-instance v2, Ll4/s;

    .line 100
    .line 101
    const-string v4, "HMACSHA256"

    .line 102
    .line 103
    invoke-direct {v2, v4, v6}, Ll4/s;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v2, v1}, Li6/m;-><init>(Lf6/a;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    new-instance v0, Li6/m;

    .line 111
    .line 112
    new-instance v2, Ll4/s;

    .line 113
    .line 114
    const-string v4, "HMACSHA384"

    .line 115
    .line 116
    invoke-direct {v2, v4, v6}, Ll4/s;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v2, v1}, Li6/m;-><init>(Lf6/a;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    new-instance v0, Li6/m;

    .line 124
    .line 125
    new-instance v2, Ll4/s;

    .line 126
    .line 127
    const-string v4, "HMACSHA1"

    .line 128
    .line 129
    invoke-direct {v2, v4, v6}, Ll4/s;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, v2, v1}, Li6/m;-><init>(Lf6/a;I)V

    .line 133
    .line 134
    .line 135
    :goto_0
    return-object v0

    .line 136
    :pswitch_0
    move-object/from16 v0, p1

    .line 137
    .line 138
    check-cast v0, Lh6/b;

    .line 139
    .line 140
    new-instance v1, Li6/m;

    .line 141
    .line 142
    new-instance v2, Lb5/G1;

    .line 143
    .line 144
    invoke-virtual {v0}, Lh6/b;->z()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-direct {v2, v4}, Lb5/G1;-><init>([B)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Lh6/b;->A()Lh6/f;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lh6/f;->y()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-direct {v1, v2, v0}, Li6/m;-><init>(Lf6/a;I)V

    .line 164
    .line 165
    .line 166
    return-object v1

    .line 167
    :pswitch_1
    move-object/from16 v0, p1

    .line 168
    .line 169
    check-cast v0, Lh6/F;

    .line 170
    .line 171
    new-instance v1, Li6/d;

    .line 172
    .line 173
    invoke-virtual {v0}, Lh6/F;->y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-direct {v1, v0}, Li6/d;-><init>([B)V

    .line 182
    .line 183
    .line 184
    return-object v1

    .line 185
    :pswitch_2
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, Lh6/u0;

    .line 188
    .line 189
    new-instance v2, Li6/c;

    .line 190
    .line 191
    invoke-virtual {v1}, Lh6/u0;->y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v2, v0, v1}, Li6/c;-><init>(I[B)V

    .line 200
    .line 201
    .line 202
    return-object v2

    .line 203
    :pswitch_3
    move-object/from16 v0, p1

    .line 204
    .line 205
    check-cast v0, Lh6/p0;

    .line 206
    .line 207
    invoke-virtual {v0}, Lh6/p0;->y()Lh6/q0;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v1}, Lh6/q0;->y()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v1}, LU5/i;->a(Ljava/lang/String;)La6/c;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2, v1}, La6/c;->c(Ljava/lang/String;)La6/b;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v2, LV5/v;

    .line 224
    .line 225
    invoke-virtual {v0}, Lh6/p0;->y()Lh6/q0;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Lh6/q0;->x()Lh6/b0;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {v2, v0, v1}, LV5/v;-><init>(Lh6/b0;La6/b;)V

    .line 234
    .line 235
    .line 236
    return-object v2

    .line 237
    :pswitch_4
    move-object/from16 v0, p1

    .line 238
    .line 239
    check-cast v0, Lh6/m0;

    .line 240
    .line 241
    invoke-virtual {v0}, Lh6/m0;->y()Lh6/n0;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Lh6/n0;->x()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, LU5/i;->a(Ljava/lang/String;)La6/c;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1, v0}, La6/c;->c(Ljava/lang/String;)La6/b;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :pswitch_5
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, Lh6/J;

    .line 261
    .line 262
    new-instance v1, Li6/c;

    .line 263
    .line 264
    invoke-virtual {v0}, Lh6/J;->y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v1, v2, v0}, Li6/c;-><init>(I[B)V

    .line 273
    .line 274
    .line 275
    return-object v1

    .line 276
    :pswitch_6
    move-object/from16 v0, p1

    .line 277
    .line 278
    check-cast v0, Lh6/B;

    .line 279
    .line 280
    new-instance v1, LX5/a;

    .line 281
    .line 282
    invoke-virtual {v0}, Lh6/B;->y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-direct {v1, v0}, LX5/a;-><init>([B)V

    .line 291
    .line 292
    .line 293
    return-object v1

    .line 294
    :pswitch_7
    move-object/from16 v0, p1

    .line 295
    .line 296
    check-cast v0, Lh6/x;

    .line 297
    .line 298
    new-instance v2, Li6/c;

    .line 299
    .line 300
    invoke-virtual {v0}, Lh6/x;->y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {v2, v1, v0}, Li6/c;-><init>(I[B)V

    .line 309
    .line 310
    .line 311
    return-object v2

    .line 312
    :pswitch_8
    move-object/from16 v0, p1

    .line 313
    .line 314
    check-cast v0, Lh6/r;

    .line 315
    .line 316
    new-instance v1, Li6/b;

    .line 317
    .line 318
    invoke-virtual {v0}, Lh6/r;->z()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v0}, Lh6/r;->A()Lh6/v;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Lh6/v;->y()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-direct {v1, v0, v2}, Li6/b;-><init>(I[B)V

    .line 335
    .line 336
    .line 337
    return-object v1

    .line 338
    :pswitch_9
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, Lh6/l;

    .line 341
    .line 342
    new-instance v1, Li6/a;

    .line 343
    .line 344
    invoke-virtual {v0}, Lh6/l;->A()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v0}, Lh6/l;->B()Lh6/p;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Lh6/p;->y()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    invoke-direct {v1, v0, v2}, Li6/a;-><init>(I[B)V

    .line 361
    .line 362
    .line 363
    return-object v1

    .line 364
    :pswitch_a
    move-object/from16 v0, p1

    .line 365
    .line 366
    check-cast v0, Lh6/h;

    .line 367
    .line 368
    new-instance v4, Li6/g;

    .line 369
    .line 370
    new-instance v5, LV5/f;

    .line 371
    .line 372
    const-class v6, Li6/k;

    .line 373
    .line 374
    invoke-direct {v5, v2, v6}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 375
    .line 376
    .line 377
    new-array v7, v2, [LV5/f;

    .line 378
    .line 379
    aput-object v5, v7, v1

    .line 380
    .line 381
    new-instance v5, Ljava/util/HashMap;

    .line 382
    .line 383
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 384
    .line 385
    .line 386
    array-length v8, v7

    .line 387
    move v9, v1

    .line 388
    :goto_1
    const-string v10, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 389
    .line 390
    if-ge v9, v8, :cond_6

    .line 391
    .line 392
    aget-object v11, v7, v9

    .line 393
    .line 394
    iget-object v12, v11, LV5/f;->a:Ljava/lang/Class;

    .line 395
    .line 396
    invoke-virtual {v5, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    iget-object v13, v11, LV5/f;->a:Ljava/lang/Class;

    .line 401
    .line 402
    if-nez v12, :cond_5

    .line 403
    .line 404
    invoke-virtual {v5, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    add-int/2addr v9, v2

    .line 408
    goto :goto_1

    .line 409
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 410
    .line 411
    new-instance v1, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v13, v1}, Lcom/google/android/gms/internal/measurement/k1;->l(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v0

    .line 424
    :cond_6
    array-length v8, v7

    .line 425
    if-lez v8, :cond_7

    .line 426
    .line 427
    aget-object v7, v7, v1

    .line 428
    .line 429
    iget-object v7, v7, LV5/f;->a:Ljava/lang/Class;

    .line 430
    .line 431
    :cond_7
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    invoke-virtual {v0}, Lh6/h;->z()Lh6/l;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    check-cast v5, LV5/f;

    .line 444
    .line 445
    const-string v8, " not supported."

    .line 446
    .line 447
    const-string v9, "Requested primitive class "

    .line 448
    .line 449
    if-eqz v5, :cond_c

    .line 450
    .line 451
    invoke-virtual {v5, v7}, LV5/f;->a(Lcom/google/crypto/tink/shaded/protobuf/a;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    check-cast v5, Li6/k;

    .line 456
    .line 457
    new-instance v6, LV5/f;

    .line 458
    .line 459
    const-class v7, LU5/j;

    .line 460
    .line 461
    const/16 v11, 0xb

    .line 462
    .line 463
    invoke-direct {v6, v11, v7}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 464
    .line 465
    .line 466
    new-array v11, v2, [LV5/f;

    .line 467
    .line 468
    aput-object v6, v11, v1

    .line 469
    .line 470
    new-instance v6, Ljava/util/HashMap;

    .line 471
    .line 472
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 473
    .line 474
    .line 475
    array-length v12, v11

    .line 476
    move v13, v1

    .line 477
    :goto_2
    if-ge v13, v12, :cond_9

    .line 478
    .line 479
    aget-object v14, v11, v13

    .line 480
    .line 481
    iget-object v15, v14, LV5/f;->a:Ljava/lang/Class;

    .line 482
    .line 483
    invoke-virtual {v6, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v15

    .line 487
    move/from16 v16, v1

    .line 488
    .line 489
    iget-object v1, v14, LV5/f;->a:Ljava/lang/Class;

    .line 490
    .line 491
    if-nez v15, :cond_8

    .line 492
    .line 493
    invoke-virtual {v6, v1, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    add-int/2addr v13, v2

    .line 497
    move/from16 v1, v16

    .line 498
    .line 499
    goto :goto_2

    .line 500
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 501
    .line 502
    new-instance v2, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/k1;->l(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0

    .line 515
    :cond_9
    move/from16 v16, v1

    .line 516
    .line 517
    array-length v1, v11

    .line 518
    if-lez v1, :cond_a

    .line 519
    .line 520
    aget-object v1, v11, v16

    .line 521
    .line 522
    iget-object v1, v1, LV5/f;->a:Ljava/lang/Class;

    .line 523
    .line 524
    :cond_a
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v0}, Lh6/h;->A()Lh6/Q;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    check-cast v1, LV5/f;

    .line 537
    .line 538
    if-eqz v1, :cond_b

    .line 539
    .line 540
    invoke-virtual {v1, v2}, LV5/f;->a(Lcom/google/crypto/tink/shaded/protobuf/a;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, LU5/j;

    .line 545
    .line 546
    invoke-virtual {v0}, Lh6/h;->A()Lh6/Q;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Lh6/Q;->B()Lh6/V;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Lh6/V;->A()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    invoke-direct {v4, v5, v1, v0}, Li6/g;-><init>(Li6/k;LU5/j;I)V

    .line 559
    .line 560
    .line 561
    return-object v4

    .line 562
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 563
    .line 564
    new-instance v1, Ljava/lang/StringBuilder;

    .line 565
    .line 566
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v0

    .line 587
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 588
    .line 589
    new-instance v1, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    throw v0

    .line 612
    nop

    .line 613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

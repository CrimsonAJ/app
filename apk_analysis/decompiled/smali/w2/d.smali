.class public final Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/s;


# static fields
.field public static final b:Lw2/d;

.field public static volatile c:LB2/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw2/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw2/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw2/d;->b:Lw2/d;

    .line 8
    .line 9
    return-void
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
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw2/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo7/y;Ly2/a;)LB2/c;
    .locals 16

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "<this>"

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    const-wide/16 v5, 0x3c

    .line 8
    .line 9
    const-wide/16 v7, 0x5a

    .line 10
    .line 11
    :try_start_0
    new-instance v9, Lw2/c;

    .line 12
    .line 13
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-array v10, v1, [Ljavax/net/ssl/TrustManager;

    .line 17
    .line 18
    aput-object v9, v10, v2

    .line 19
    .line 20
    const-string v9, "SSL"

    .line 21
    .line 22
    invoke-static {v9}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    new-instance v11, Ljava/security/SecureRandom;

    .line 27
    .line 28
    invoke-direct {v11}, Ljava/security/SecureRandom;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v9, v4, v10, v11}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v9}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    new-instance v11, Li8/D;

    .line 39
    .line 40
    invoke-direct {v11}, Li8/D;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Li8/E;

    .line 44
    .line 45
    invoke-direct {v12, v11}, Li8/E;-><init>(Li8/D;)V

    .line 46
    .line 47
    .line 48
    sget-object v11, LE2/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-eqz v11, :cond_0

    .line 55
    .line 56
    sget-object v11, Lg6/o;->a:Lg6/o;

    .line 57
    .line 58
    invoke-virtual {v11}, Lg6/o;->F()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    invoke-static {v13, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v14, Li8/x;

    .line 66
    .line 67
    invoke-direct {v14}, Li8/x;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v14, v4, v13}, Li8/x;->e(Li8/y;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v14}, Li8/x;->b()Li8/y;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    invoke-virtual {v11}, Lg6/o;->D()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    invoke-static {v14}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    invoke-virtual {v11}, Lg6/o;->E()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    invoke-static {v11}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    new-array v15, v0, [Ljava/net/InetAddress;

    .line 94
    .line 95
    aput-object v14, v15, v2

    .line 96
    .line 97
    aput-object v11, v15, v1

    .line 98
    .line 99
    invoke-static {v15}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v12}, Li8/E;->b()Li8/D;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    sget-object v15, Lj8/b;->c:Li8/A;

    .line 108
    .line 109
    new-instance v15, Lj8/a;

    .line 110
    .line 111
    iget-object v0, v13, Li8/y;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v15, v2, v0, v11}, Lj8/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14, v15}, Li8/D;->d(Li8/s;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, Li8/E;

    .line 120
    .line 121
    invoke-direct {v0, v14}, Li8/E;-><init>(Li8/D;)V

    .line 122
    .line 123
    .line 124
    new-instance v11, Lj8/b;

    .line 125
    .line 126
    invoke-direct {v11, v0, v13}, Lj8/b;-><init>(Li8/E;Li8/y;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Li8/E;->b()Li8/D;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0, v11}, Li8/D;->d(Li8/s;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {v12}, Li8/E;->b()Li8/D;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_0
    new-instance v11, Lw2/d;

    .line 142
    .line 143
    invoke-direct {v11, v1}, Lw2/d;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v11}, Li8/D;->d(Li8/s;)V

    .line 147
    .line 148
    .line 149
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 150
    .line 151
    invoke-virtual {v0, v7, v8}, Li8/D;->b(J)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Li8/D;->c()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v5, v6}, Li8/D;->e(J)V

    .line 158
    .line 159
    .line 160
    new-instance v11, LD2/a;

    .line 161
    .line 162
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v11}, Li8/D;->a(Li8/z;)V

    .line 166
    .line 167
    .line 168
    new-instance v11, LB2/h;

    .line 169
    .line 170
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v11}, Li8/D;->a(Li8/z;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v9}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    aget-object v10, v10, v2

    .line 180
    .line 181
    const-string v11, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"

    .line 182
    .line 183
    invoke-static {v10, v11}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    check-cast v10, Ljavax/net/ssl/X509TrustManager;

    .line 187
    .line 188
    iget-object v11, v0, Li8/D;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 189
    .line 190
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_1

    .line 195
    .line 196
    iget-object v11, v0, Li8/D;->q:Ljavax/net/ssl/X509TrustManager;

    .line 197
    .line 198
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-nez v11, :cond_2

    .line 203
    .line 204
    :cond_1
    iput-object v4, v0, Li8/D;->B:Li/G;

    .line 205
    .line 206
    :cond_2
    iput-object v9, v0, Li8/D;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 207
    .line 208
    sget-object v9, Ls8/p;->a:Ls8/p;

    .line 209
    .line 210
    sget-object v9, Ls8/p;->a:Ls8/p;

    .line 211
    .line 212
    invoke-virtual {v9, v10}, Ls8/p;->b(Ljavax/net/ssl/X509TrustManager;)Lcom/google/android/gms/internal/measurement/D1;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    iput-object v9, v0, Li8/D;->v:Lcom/google/android/gms/internal/measurement/D1;

    .line 217
    .line 218
    iput-object v10, v0, Li8/D;->q:Ljavax/net/ssl/X509TrustManager;

    .line 219
    .line 220
    new-instance v9, Lw2/a;

    .line 221
    .line 222
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    iget-object v10, v0, Li8/D;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 226
    .line 227
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-nez v10, :cond_3

    .line 232
    .line 233
    iput-object v4, v0, Li8/D;->B:Li/G;

    .line 234
    .line 235
    :cond_3
    iput-object v9, v0, Li8/D;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 236
    .line 237
    new-instance v9, Li8/E;

    .line 238
    .line 239
    invoke-direct {v9, v0}, Li8/E;-><init>(Li8/D;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :catch_0
    new-instance v0, Li8/D;

    .line 245
    .line 246
    invoke-direct {v0}, Li8/D;-><init>()V

    .line 247
    .line 248
    .line 249
    new-instance v9, Li8/E;

    .line 250
    .line 251
    invoke-direct {v9, v0}, Li8/E;-><init>(Li8/D;)V

    .line 252
    .line 253
    .line 254
    sget-object v0, LE2/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_4

    .line 261
    .line 262
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 263
    .line 264
    invoke-virtual {v0}, Lg6/o;->F()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-static {v10, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v3, Li8/x;

    .line 272
    .line 273
    invoke-direct {v3}, Li8/x;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v4, v10}, Li8/x;->e(Li8/y;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Li8/x;->b()Li8/y;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v0}, Lg6/o;->D()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-static {v4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v0}, Lg6/o;->E()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const/4 v10, 0x2

    .line 300
    new-array v11, v10, [Ljava/net/InetAddress;

    .line 301
    .line 302
    aput-object v4, v11, v2

    .line 303
    .line 304
    aput-object v0, v11, v1

    .line 305
    .line 306
    invoke-static {v11}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v9}, Li8/E;->b()Li8/D;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    sget-object v4, Lj8/b;->c:Li8/A;

    .line 315
    .line 316
    new-instance v4, Lj8/a;

    .line 317
    .line 318
    iget-object v10, v3, Li8/y;->d:Ljava/lang/String;

    .line 319
    .line 320
    invoke-direct {v4, v2, v10, v0}, Lj8/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v4}, Li8/D;->d(Li8/s;)V

    .line 324
    .line 325
    .line 326
    new-instance v0, Li8/E;

    .line 327
    .line 328
    invoke-direct {v0, v1}, Li8/E;-><init>(Li8/D;)V

    .line 329
    .line 330
    .line 331
    new-instance v1, Lj8/b;

    .line 332
    .line 333
    invoke-direct {v1, v0, v3}, Lj8/b;-><init>(Li8/E;Li8/y;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9}, Li8/E;->b()Li8/D;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0, v1}, Li8/D;->d(Li8/s;)V

    .line 341
    .line 342
    .line 343
    goto :goto_1

    .line 344
    :cond_4
    invoke-virtual {v9}, Li8/E;->b()Li8/D;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :goto_1
    new-instance v1, Lw2/d;

    .line 349
    .line 350
    const/4 v10, 0x2

    .line 351
    invoke-direct {v1, v10}, Lw2/d;-><init>(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v1}, Li8/D;->d(Li8/s;)V

    .line 355
    .line 356
    .line 357
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 358
    .line 359
    invoke-virtual {v0, v7, v8}, Li8/D;->b(J)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Li8/D;->c()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v5, v6}, Li8/D;->e(J)V

    .line 366
    .line 367
    .line 368
    new-instance v1, LD2/a;

    .line 369
    .line 370
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v1}, Li8/D;->a(Li8/z;)V

    .line 374
    .line 375
    .line 376
    new-instance v1, LB2/h;

    .line 377
    .line 378
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v1}, Li8/D;->a(Li8/z;)V

    .line 382
    .line 383
    .line 384
    new-instance v9, Li8/E;

    .line 385
    .line 386
    invoke-direct {v9, v0}, Li8/E;-><init>(Li8/D;)V

    .line 387
    .line 388
    .line 389
    :goto_2
    new-instance v0, Ll1/g;

    .line 390
    .line 391
    const/16 v1, 0xf

    .line 392
    .line 393
    invoke-direct {v0, v1}, Ll1/g;-><init>(I)V

    .line 394
    .line 395
    .line 396
    iput-object v9, v0, Ll1/g;->a:Ljava/lang/Object;

    .line 397
    .line 398
    invoke-static/range {p1 .. p1}, LO4/h;->t(Ly2/a;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v0, v1}, Ll1/g;->e(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    new-instance v1, LA8/a;

    .line 406
    .line 407
    move-object/from16 v2, p0

    .line 408
    .line 409
    invoke-direct {v1, v2}, LA8/a;-><init>(Lo7/y;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v1}, Ll1/g;->b(LA8/a;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0}, Ll1/g;->g()Lz8/Q;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const-class v1, LB2/c;

    .line 420
    .line 421
    invoke-virtual {v0, v1}, Lz8/Q;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    const-string v1, "create(...)"

    .line 426
    .line 427
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    check-cast v0, LB2/c;

    .line 431
    .line 432
    return-object v0
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method


# virtual methods
.method public i(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    iget v0, p0, Lw2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "hostname"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getAllByName(hostname)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    new-instance v0, Lw2/b;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, v1}, Lw2/b;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, LB7/k;->C0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception v0

    .line 36
    new-instance v1, Ljava/net/UnknownHostException;

    .line 37
    .line 38
    const-string v2, "Broken system behaviour for dns lookup of "

    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :pswitch_0
    const-string v0, "hostname"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "getAllByName(hostname)"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 69
    new-instance v0, Lw2/b;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-direct {v0, v1}, Lw2/b;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, LB7/k;->C0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :catch_1
    move-exception v0

    .line 81
    new-instance v1, Ljava/net/UnknownHostException;

    .line 82
    .line 83
    const-string v2, "Broken system behaviour for dns lookup of "

    .line 84
    .line 85
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    throw v1

    .line 96
    :pswitch_1
    const-string v0, "hostname"

    .line 97
    .line 98
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :try_start_2
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "getAllByName(hostname)"

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    .line 114
    new-instance v0, Lw2/b;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    invoke-direct {v0, v1}, Lw2/b;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0}, LB7/k;->C0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :catch_2
    move-exception v0

    .line 126
    new-instance v1, Ljava/net/UnknownHostException;

    .line 127
    .line 128
    const-string v2, "Broken system behaviour for dns lookup of "

    .line 129
    .line 130
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.class public final Ly3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# static fields
.field public static final I:[B

.field public static final J:Lj3/M;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:Z

.field public E:Lq3/l;

.field public F:[Lq3/u;

.field public G:[Lq3/u;

.field public H:Z

.field public final a:I

.field public final b:Ly3/o;

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:LA4/r;

.field public final f:LA4/r;

.field public final g:LA4/r;

.field public final h:[B

.field public final i:LA4/r;

.field public final j:Ll4/x;

.field public final k:LA1/g;

.field public final l:LA4/r;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:LQ3/o;

.field public p:I

.field public q:I

.field public r:J

.field public s:I

.field public t:LA4/r;

.field public u:J

.field public v:I

.field public w:J

.field public x:J

.field public y:J

.field public z:Ly3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly3/i;->I:[B

    .line 9
    .line 10
    new-instance v0, Lj3/L;

    .line 11
    .line 12
    invoke-direct {v0}, Lj3/L;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    iput-object v1, v0, Lj3/L;->k:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v1, Lj3/M;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lj3/M;-><init>(Lj3/L;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ly3/i;->J:Lj3/M;

    .line 25
    .line 26
    return-void

    .line 27
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public constructor <init>(ILl4/x;Ly3/o;Ljava/util/List;LQ3/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ly3/i;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Ly3/i;->j:Ll4/x;

    .line 7
    .line 8
    iput-object p3, p0, Ly3/i;->b:Ly3/o;

    .line 9
    .line 10
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ly3/i;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, p0, Ly3/i;->o:LQ3/o;

    .line 17
    .line 18
    new-instance p1, LA1/g;

    .line 19
    .line 20
    const/16 p2, 0xf

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-direct {p1, p2, p3}, LA1/g;-><init>(IB)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ly3/i;->k:LA1/g;

    .line 27
    .line 28
    new-instance p1, LA4/r;

    .line 29
    .line 30
    const/16 p2, 0x10

    .line 31
    .line 32
    invoke-direct {p1, p2}, LA4/r;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly3/i;->l:LA4/r;

    .line 36
    .line 37
    new-instance p1, LA4/r;

    .line 38
    .line 39
    sget-object p3, Ll4/a;->d:[B

    .line 40
    .line 41
    invoke-direct {p1, p3}, LA4/r;-><init>([B)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ly3/i;->e:LA4/r;

    .line 45
    .line 46
    new-instance p1, LA4/r;

    .line 47
    .line 48
    const/4 p3, 0x5

    .line 49
    invoke-direct {p1, p3}, LA4/r;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ly3/i;->f:LA4/r;

    .line 53
    .line 54
    new-instance p1, LA4/r;

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    invoke-direct {p1, p3, p4}, LA4/r;-><init>(IZ)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Ly3/i;->g:LA4/r;

    .line 61
    .line 62
    new-array p1, p2, [B

    .line 63
    .line 64
    iput-object p1, p0, Ly3/i;->h:[B

    .line 65
    .line 66
    new-instance p2, LA4/r;

    .line 67
    .line 68
    invoke-direct {p2, p1}, LA4/r;-><init>([B)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Ly3/i;->i:LA4/r;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Ly3/i;->m:Ljava/util/ArrayDeque;

    .line 79
    .line 80
    new-instance p1, Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Ly3/i;->n:Ljava/util/ArrayDeque;

    .line 86
    .line 87
    new-instance p1, Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Ly3/i;->d:Landroid/util/SparseArray;

    .line 93
    .line 94
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    iput-wide p1, p0, Ly3/i;->x:J

    .line 100
    .line 101
    iput-wide p1, p0, Ly3/i;->w:J

    .line 102
    .line 103
    iput-wide p1, p0, Ly3/i;->y:J

    .line 104
    .line 105
    sget-object p1, Lq3/l;->e0:Ld0/o;

    .line 106
    .line 107
    iput-object p1, p0, Ly3/i;->E:Lq3/l;

    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    new-array p2, p1, [Lq3/u;

    .line 111
    .line 112
    iput-object p2, p0, Ly3/i;->F:[Lq3/u;

    .line 113
    .line 114
    new-array p1, p1, [Lq3/u;

    .line 115
    .line 116
    iput-object p1, p0, Ly3/i;->G:[Lq3/u;

    .line 117
    .line 118
    return-void
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
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
.end method

.method public static c(Ljava/util/ArrayList;)Ln3/g;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Ly3/b;

    .line 16
    .line 17
    iget v6, v5, LQ0/b;->b:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, Ly3/b;->c:LA4/r;

    .line 32
    .line 33
    iget-object v5, v5, LA4/r;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, [B

    .line 36
    .line 37
    invoke-static {v5}, Ly3/j;->e([B)LA3/E;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    move-object v6, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object v6, v6, LA3/E;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Ljava/util/UUID;

    .line 48
    .line 49
    :goto_1
    if-nez v6, :cond_2

    .line 50
    .line 51
    const-string v5, "FragmentedMp4Extractor"

    .line 52
    .line 53
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 54
    .line 55
    invoke-static {v5, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    new-instance v7, Ln3/f;

    .line 60
    .line 61
    const-string v8, "video/mp4"

    .line 62
    .line 63
    invoke-direct {v7, v6, v1, v8, v5}, Ln3/f;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    if-nez v4, :cond_5

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_5
    new-instance p0, Ln3/g;

    .line 76
    .line 77
    new-array v0, v2, [Ln3/f;

    .line 78
    .line 79
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, [Ln3/f;

    .line 84
    .line 85
    invoke-direct {p0, v1, v2, v0}, Ln3/g;-><init>(Ljava/lang/String;Z[Ln3/f;)V

    .line 86
    .line 87
    .line 88
    return-object p0
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public static d(LA4/r;ILy3/q;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA4/r;->H(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LA4/r;->i()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 v0, p1, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    and-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move p1, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v1

    .line 23
    :goto_0
    invoke-virtual {p0}, LA4/r;->A()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    iget-object p0, p2, Ly3/q;->l:[Z

    .line 30
    .line 31
    iget p1, p2, Ly3/q;->e:I

    .line 32
    .line 33
    invoke-static {p0, v1, p1, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget v3, p2, Ly3/q;->e:I

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-object v3, p2, Ly3/q;->l:[Z

    .line 42
    .line 43
    invoke-static {v3, v1, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LA4/r;->e()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget-object v2, p2, Ly3/q;->n:LA4/r;

    .line 51
    .line 52
    invoke-virtual {v2, p1}, LA4/r;->E(I)V

    .line 53
    .line 54
    .line 55
    iput-boolean v0, p2, Ly3/q;->k:Z

    .line 56
    .line 57
    iput-boolean v0, p2, Ly3/q;->o:Z

    .line 58
    .line 59
    iget-object p1, v2, LA4/r;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, [B

    .line 62
    .line 63
    iget v0, v2, LA4/r;->b:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v1, v0}, LA4/r;->h([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, LA4/r;->H(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p2, Ly3/q;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "Senc sample count "

    .line 75
    .line 76
    const-string p1, " is different from fragment sample count"

    .line 77
    .line 78
    invoke-static {p0, v2, p1}, LA0/a;->p(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p1, p2, Ly3/q;->e:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p0, p1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 98
    .line 99
    invoke-static {p0}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final b(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Ly3/i;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ly3/h;

    .line 16
    .line 17
    invoke-virtual {v2}, Ly3/h;->d()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Ly3/i;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Ly3/i;->v:I

    .line 29
    .line 30
    iput-wide p3, p0, Ly3/i;->w:J

    .line 31
    .line 32
    iget-object p1, p0, Ly3/i;->m:Ljava/util/ArrayDeque;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 35
    .line 36
    .line 37
    iput v0, p0, Ly3/i;->p:I

    .line 38
    .line 39
    iput v0, p0, Ly3/i;->s:I

    .line 40
    .line 41
    return-void
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

.method public final e(J)V
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v6, v0, Ly3/i;->m:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    if-nez v7, :cond_5d

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    check-cast v7, Ly3/a;

    .line 16
    .line 17
    iget-wide v9, v7, Ly3/a;->c:J

    .line 18
    .line 19
    cmp-long v7, v9, p1

    .line 20
    .line 21
    if-nez v7, :cond_5d

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    move-object v9, v7

    .line 28
    check-cast v9, Ly3/a;

    .line 29
    .line 30
    iget v7, v9, LQ0/b;->b:I

    .line 31
    .line 32
    iget-object v10, v0, Ly3/i;->d:Landroid/util/SparseArray;

    .line 33
    .line 34
    iget-object v11, v9, Ly3/a;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v12, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    iget v13, v0, Ly3/i;->a:I

    .line 40
    .line 41
    const/16 v14, 0xc

    .line 42
    .line 43
    const/16 v17, 0x2

    .line 44
    .line 45
    const/16 v18, 0x10

    .line 46
    .line 47
    iget-object v15, v0, Ly3/i;->b:Ly3/o;

    .line 48
    .line 49
    if-ne v7, v12, :cond_f

    .line 50
    .line 51
    if-nez v15, :cond_1

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v6, 0x0

    .line 56
    :goto_1
    if-eqz v6, :cond_e

    .line 57
    .line 58
    move v12, v13

    .line 59
    invoke-static {v11}, Ly3/i;->c(Ljava/util/ArrayList;)Ln3/g;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    const v6, 0x6d766578

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v6}, Ly3/a;->r(I)Ly3/a;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v7, Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-object v6, v6, Ly3/a;->d:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    const/4 v15, 0x0

    .line 90
    :goto_2
    if-ge v15, v11, :cond_5

    .line 91
    .line 92
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v16

    .line 96
    const/16 v19, 0x4

    .line 97
    .line 98
    move-object/from16 v1, v16

    .line 99
    .line 100
    check-cast v1, Ly3/b;

    .line 101
    .line 102
    iget v8, v1, LQ0/b;->b:I

    .line 103
    .line 104
    const/16 v21, 0x1

    .line 105
    .line 106
    const v5, 0x74726578

    .line 107
    .line 108
    .line 109
    iget-object v1, v1, Ly3/b;->c:LA4/r;

    .line 110
    .line 111
    if-ne v8, v5, :cond_2

    .line 112
    .line 113
    invoke-virtual {v1, v14}, LA4/r;->H(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, LA4/r;->i()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {v1}, LA4/r;->i()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    add-int/lit8 v8, v8, -0x1

    .line 125
    .line 126
    invoke-virtual {v1}, LA4/r;->i()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    invoke-virtual {v1}, LA4/r;->i()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {v1}, LA4/r;->i()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    move-wide/from16 v23, v3

    .line 143
    .line 144
    new-instance v3, Ly3/f;

    .line 145
    .line 146
    invoke-direct {v3, v8, v14, v2, v1}, Ly3/f;-><init>(IIII)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Ly3/f;

    .line 164
    .line 165
    invoke-virtual {v7, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_2
    move-wide/from16 v23, v3

    .line 170
    .line 171
    const v2, 0x6d656864

    .line 172
    .line 173
    .line 174
    if-ne v8, v2, :cond_4

    .line 175
    .line 176
    const/16 v2, 0x8

    .line 177
    .line 178
    invoke-virtual {v1, v2}, LA4/r;->H(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, LA4/r;->i()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-static {v2}, LQ0/b;->q(I)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_3

    .line 190
    .line 191
    invoke-virtual {v1}, LA4/r;->y()J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    goto :goto_3

    .line 196
    :cond_3
    invoke-virtual {v1}, LA4/r;->B()J

    .line 197
    .line 198
    .line 199
    move-result-wide v1

    .line 200
    :goto_3
    move-wide v3, v1

    .line 201
    goto :goto_5

    .line 202
    :cond_4
    :goto_4
    move-wide/from16 v3, v23

    .line 203
    .line 204
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 205
    .line 206
    const/16 v14, 0xc

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    move-wide/from16 v23, v3

    .line 210
    .line 211
    const/16 v19, 0x4

    .line 212
    .line 213
    const/16 v21, 0x1

    .line 214
    .line 215
    new-instance v1, Lq3/o;

    .line 216
    .line 217
    invoke-direct {v1}, Lq3/o;-><init>()V

    .line 218
    .line 219
    .line 220
    and-int/lit8 v2, v12, 0x10

    .line 221
    .line 222
    if-eqz v2, :cond_6

    .line 223
    .line 224
    move/from16 v14, v21

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_6
    const/4 v14, 0x0

    .line 228
    :goto_6
    new-instance v2, Lj2/b;

    .line 229
    .line 230
    const/16 v3, 0x14

    .line 231
    .line 232
    invoke-direct {v2, v3, v0}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    const/4 v15, 0x0

    .line 236
    move-object v11, v10

    .line 237
    move-object v10, v1

    .line 238
    move-object v1, v11

    .line 239
    move-object/from16 v16, v2

    .line 240
    .line 241
    move-wide/from16 v11, v23

    .line 242
    .line 243
    invoke-static/range {v9 .. v16}, Ly3/e;->e(Ly3/a;Lq3/o;JLn3/g;ZZLO5/f;)Ljava/util/ArrayList;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_9

    .line 256
    .line 257
    const/4 v4, 0x0

    .line 258
    :goto_7
    if-ge v4, v3, :cond_8

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    check-cast v5, Ly3/r;

    .line 265
    .line 266
    iget-object v6, v5, Ly3/r;->a:Ly3/o;

    .line 267
    .line 268
    new-instance v8, Ly3/h;

    .line 269
    .line 270
    iget-object v9, v0, Ly3/i;->E:Lq3/l;

    .line 271
    .line 272
    iget v10, v6, Ly3/o;->b:I

    .line 273
    .line 274
    invoke-interface {v9, v4, v10}, Lq3/l;->u(II)Lq3/u;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    iget v11, v6, Ly3/o;->a:I

    .line 283
    .line 284
    move/from16 v12, v21

    .line 285
    .line 286
    if-ne v10, v12, :cond_7

    .line 287
    .line 288
    const/4 v10, 0x0

    .line 289
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v12

    .line 293
    check-cast v12, Ly3/f;

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_7
    invoke-virtual {v7, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    move-object v12, v10

    .line 301
    check-cast v12, Ly3/f;

    .line 302
    .line 303
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    :goto_8
    invoke-direct {v8, v9, v5, v12}, Ly3/h;-><init>(Lq3/u;Ly3/r;Ly3/f;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v11, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    iget-wide v8, v0, Ly3/i;->x:J

    .line 313
    .line 314
    iget-wide v5, v6, Ly3/o;->e:J

    .line 315
    .line 316
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 317
    .line 318
    .line 319
    move-result-wide v5

    .line 320
    iput-wide v5, v0, Ly3/i;->x:J

    .line 321
    .line 322
    const/16 v21, 0x1

    .line 323
    .line 324
    add-int/lit8 v4, v4, 0x1

    .line 325
    .line 326
    const/16 v21, 0x1

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_8
    iget-object v1, v0, Ly3/i;->E:Lq3/l;

    .line 330
    .line 331
    invoke-interface {v1}, Lq3/l;->i()V

    .line 332
    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-ne v4, v3, :cond_a

    .line 340
    .line 341
    const/4 v4, 0x1

    .line 342
    goto :goto_9

    .line 343
    :cond_a
    const/4 v4, 0x0

    .line 344
    :goto_9
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 345
    .line 346
    .line 347
    const/4 v4, 0x0

    .line 348
    :goto_a
    if-ge v4, v3, :cond_c

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Ly3/r;

    .line 355
    .line 356
    iget-object v6, v5, Ly3/r;->a:Ly3/o;

    .line 357
    .line 358
    iget v8, v6, Ly3/o;->a:I

    .line 359
    .line 360
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    check-cast v8, Ly3/h;

    .line 365
    .line 366
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    const/4 v12, 0x1

    .line 371
    if-ne v9, v12, :cond_b

    .line 372
    .line 373
    const/4 v10, 0x0

    .line 374
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    check-cast v6, Ly3/f;

    .line 379
    .line 380
    goto :goto_b

    .line 381
    :cond_b
    iget v6, v6, Ly3/o;->a:I

    .line 382
    .line 383
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    check-cast v6, Ly3/f;

    .line 388
    .line 389
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    :goto_b
    iput-object v5, v8, Ly3/h;->d:Ly3/r;

    .line 393
    .line 394
    iput-object v6, v8, Ly3/h;->e:Ly3/f;

    .line 395
    .line 396
    iget-object v5, v5, Ly3/r;->a:Ly3/o;

    .line 397
    .line 398
    iget-object v5, v5, Ly3/o;->f:Lj3/M;

    .line 399
    .line 400
    iget-object v6, v8, Ly3/h;->a:Lq3/u;

    .line 401
    .line 402
    invoke-interface {v6, v5}, Lq3/u;->e(Lj3/M;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v8}, Ly3/h;->d()V

    .line 406
    .line 407
    .line 408
    const/16 v21, 0x1

    .line 409
    .line 410
    add-int/lit8 v4, v4, 0x1

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_c
    :goto_c
    move/from16 v12, v18

    .line 414
    .line 415
    move/from16 v15, v19

    .line 416
    .line 417
    const/16 v13, 0x8

    .line 418
    .line 419
    :cond_d
    const/16 v21, 0x1

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 424
    .line 425
    const-string v2, "Unexpected moov box."

    .line 426
    .line 427
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v1

    .line 431
    :cond_f
    move-object v1, v10

    .line 432
    move v12, v13

    .line 433
    const/16 v19, 0x4

    .line 434
    .line 435
    const v2, 0x6d6f6f66

    .line 436
    .line 437
    .line 438
    if-ne v7, v2, :cond_5c

    .line 439
    .line 440
    if-eqz v15, :cond_10

    .line 441
    .line 442
    const/4 v2, 0x1

    .line 443
    goto :goto_d

    .line 444
    :cond_10
    const/4 v2, 0x0

    .line 445
    :goto_d
    iget-object v5, v9, Ly3/a;->e:Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    const/4 v10, 0x0

    .line 452
    :goto_e
    if-ge v10, v6, :cond_55

    .line 453
    .line 454
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    check-cast v8, Ly3/a;

    .line 459
    .line 460
    iget v9, v8, LQ0/b;->b:I

    .line 461
    .line 462
    const v13, 0x74726166

    .line 463
    .line 464
    .line 465
    if-ne v9, v13, :cond_54

    .line 466
    .line 467
    const v9, 0x74666864

    .line 468
    .line 469
    .line 470
    invoke-virtual {v8, v9}, Ly3/a;->s(I)Ly3/b;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    iget-object v9, v9, Ly3/b;->c:LA4/r;

    .line 478
    .line 479
    const/16 v13, 0x8

    .line 480
    .line 481
    invoke-virtual {v9, v13}, LA4/r;->H(I)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v9}, LA4/r;->i()I

    .line 485
    .line 486
    .line 487
    move-result v13

    .line 488
    invoke-virtual {v9}, LA4/r;->i()I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    if-eqz v2, :cond_11

    .line 493
    .line 494
    const/4 v15, 0x0

    .line 495
    invoke-virtual {v1, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v14

    .line 499
    :goto_f
    check-cast v14, Ly3/h;

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_11
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v14

    .line 506
    goto :goto_f

    .line 507
    :goto_10
    if-nez v14, :cond_12

    .line 508
    .line 509
    move/from16 v26, v2

    .line 510
    .line 511
    move-object v15, v8

    .line 512
    const/4 v14, 0x0

    .line 513
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    goto :goto_17

    .line 519
    :cond_12
    const/16 v21, 0x1

    .line 520
    .line 521
    and-int/lit8 v15, v13, 0x1

    .line 522
    .line 523
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    iget-object v3, v14, Ly3/h;->b:Ly3/q;

    .line 529
    .line 530
    if-eqz v15, :cond_13

    .line 531
    .line 532
    move-object v15, v8

    .line 533
    invoke-virtual {v9}, LA4/r;->B()J

    .line 534
    .line 535
    .line 536
    move-result-wide v7

    .line 537
    iput-wide v7, v3, Ly3/q;->b:J

    .line 538
    .line 539
    iput-wide v7, v3, Ly3/q;->c:J

    .line 540
    .line 541
    goto :goto_11

    .line 542
    :cond_13
    move-object v15, v8

    .line 543
    :goto_11
    iget-object v7, v14, Ly3/h;->e:Ly3/f;

    .line 544
    .line 545
    and-int/lit8 v8, v13, 0x2

    .line 546
    .line 547
    if-eqz v8, :cond_14

    .line 548
    .line 549
    invoke-virtual {v9}, LA4/r;->i()I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    const/16 v21, 0x1

    .line 554
    .line 555
    add-int/lit8 v8, v8, -0x1

    .line 556
    .line 557
    :goto_12
    const/16 v22, 0x8

    .line 558
    .line 559
    goto :goto_13

    .line 560
    :cond_14
    iget v8, v7, Ly3/f;->a:I

    .line 561
    .line 562
    goto :goto_12

    .line 563
    :goto_13
    and-int/lit8 v25, v13, 0x8

    .line 564
    .line 565
    if-eqz v25, :cond_15

    .line 566
    .line 567
    invoke-virtual {v9}, LA4/r;->i()I

    .line 568
    .line 569
    .line 570
    move-result v25

    .line 571
    move/from16 v4, v25

    .line 572
    .line 573
    goto :goto_14

    .line 574
    :cond_15
    iget v4, v7, Ly3/f;->b:I

    .line 575
    .line 576
    :goto_14
    and-int/lit8 v26, v13, 0x10

    .line 577
    .line 578
    if-eqz v26, :cond_16

    .line 579
    .line 580
    invoke-virtual {v9}, LA4/r;->i()I

    .line 581
    .line 582
    .line 583
    move-result v26

    .line 584
    move/from16 v56, v26

    .line 585
    .line 586
    move/from16 v26, v2

    .line 587
    .line 588
    move/from16 v2, v56

    .line 589
    .line 590
    goto :goto_15

    .line 591
    :cond_16
    move/from16 v26, v2

    .line 592
    .line 593
    iget v2, v7, Ly3/f;->c:I

    .line 594
    .line 595
    :goto_15
    and-int/lit8 v13, v13, 0x20

    .line 596
    .line 597
    if-eqz v13, :cond_17

    .line 598
    .line 599
    invoke-virtual {v9}, LA4/r;->i()I

    .line 600
    .line 601
    .line 602
    move-result v7

    .line 603
    goto :goto_16

    .line 604
    :cond_17
    iget v7, v7, Ly3/f;->d:I

    .line 605
    .line 606
    :goto_16
    new-instance v9, Ly3/f;

    .line 607
    .line 608
    invoke-direct {v9, v8, v4, v2, v7}, Ly3/f;-><init>(IIII)V

    .line 609
    .line 610
    .line 611
    iput-object v9, v3, Ly3/q;->a:Ly3/f;

    .line 612
    .line 613
    :goto_17
    if-nez v14, :cond_18

    .line 614
    .line 615
    move-object/from16 v27, v5

    .line 616
    .line 617
    move/from16 v33, v6

    .line 618
    .line 619
    move/from16 v46, v10

    .line 620
    .line 621
    move-object/from16 v48, v11

    .line 622
    .line 623
    move/from16 v49, v12

    .line 624
    .line 625
    move/from16 v12, v18

    .line 626
    .line 627
    move/from16 v15, v19

    .line 628
    .line 629
    const/16 v14, 0xc

    .line 630
    .line 631
    :goto_18
    const/16 v13, 0x8

    .line 632
    .line 633
    const/16 v21, 0x1

    .line 634
    .line 635
    goto/16 :goto_43

    .line 636
    .line 637
    :cond_18
    iget-object v2, v14, Ly3/h;->b:Ly3/q;

    .line 638
    .line 639
    iget-wide v3, v2, Ly3/q;->p:J

    .line 640
    .line 641
    iget-boolean v7, v2, Ly3/q;->q:Z

    .line 642
    .line 643
    invoke-virtual {v14}, Ly3/h;->d()V

    .line 644
    .line 645
    .line 646
    const/4 v8, 0x1

    .line 647
    iput-boolean v8, v14, Ly3/h;->l:Z

    .line 648
    .line 649
    const v9, 0x74666474

    .line 650
    .line 651
    .line 652
    invoke-virtual {v15, v9}, Ly3/a;->s(I)Ly3/b;

    .line 653
    .line 654
    .line 655
    move-result-object v9

    .line 656
    if-eqz v9, :cond_1a

    .line 657
    .line 658
    and-int/lit8 v13, v12, 0x2

    .line 659
    .line 660
    if-nez v13, :cond_1a

    .line 661
    .line 662
    iget-object v3, v9, Ly3/b;->c:LA4/r;

    .line 663
    .line 664
    const/16 v13, 0x8

    .line 665
    .line 666
    invoke-virtual {v3, v13}, LA4/r;->H(I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v3}, LA4/r;->i()I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    invoke-static {v4}, LQ0/b;->q(I)I

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    if-ne v4, v8, :cond_19

    .line 678
    .line 679
    invoke-virtual {v3}, LA4/r;->B()J

    .line 680
    .line 681
    .line 682
    move-result-wide v3

    .line 683
    goto :goto_19

    .line 684
    :cond_19
    invoke-virtual {v3}, LA4/r;->y()J

    .line 685
    .line 686
    .line 687
    move-result-wide v3

    .line 688
    :goto_19
    iput-wide v3, v2, Ly3/q;->p:J

    .line 689
    .line 690
    iput-boolean v8, v2, Ly3/q;->q:Z

    .line 691
    .line 692
    goto :goto_1a

    .line 693
    :cond_1a
    iput-wide v3, v2, Ly3/q;->p:J

    .line 694
    .line 695
    iput-boolean v7, v2, Ly3/q;->q:Z

    .line 696
    .line 697
    :goto_1a
    iget-object v3, v15, Ly3/a;->d:Ljava/util/ArrayList;

    .line 698
    .line 699
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    const/4 v4, 0x0

    .line 704
    const/4 v8, 0x0

    .line 705
    const/4 v9, 0x0

    .line 706
    :goto_1b
    const v13, 0x7472756e

    .line 707
    .line 708
    .line 709
    if-ge v4, v7, :cond_1c

    .line 710
    .line 711
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v27

    .line 715
    move/from16 v28, v4

    .line 716
    .line 717
    move-object/from16 v4, v27

    .line 718
    .line 719
    check-cast v4, Ly3/b;

    .line 720
    .line 721
    move-object/from16 v27, v5

    .line 722
    .line 723
    iget v5, v4, LQ0/b;->b:I

    .line 724
    .line 725
    if-ne v5, v13, :cond_1b

    .line 726
    .line 727
    iget-object v4, v4, Ly3/b;->c:LA4/r;

    .line 728
    .line 729
    const/16 v5, 0xc

    .line 730
    .line 731
    invoke-virtual {v4, v5}, LA4/r;->H(I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v4}, LA4/r;->A()I

    .line 735
    .line 736
    .line 737
    move-result v4

    .line 738
    if-lez v4, :cond_1b

    .line 739
    .line 740
    add-int/2addr v9, v4

    .line 741
    const/16 v21, 0x1

    .line 742
    .line 743
    add-int/lit8 v8, v8, 0x1

    .line 744
    .line 745
    goto :goto_1c

    .line 746
    :cond_1b
    const/16 v21, 0x1

    .line 747
    .line 748
    :goto_1c
    add-int/lit8 v4, v28, 0x1

    .line 749
    .line 750
    move-object/from16 v5, v27

    .line 751
    .line 752
    goto :goto_1b

    .line 753
    :cond_1c
    move-object/from16 v27, v5

    .line 754
    .line 755
    const/4 v4, 0x0

    .line 756
    iput v4, v14, Ly3/h;->h:I

    .line 757
    .line 758
    iput v4, v14, Ly3/h;->g:I

    .line 759
    .line 760
    iput v4, v14, Ly3/h;->f:I

    .line 761
    .line 762
    iput v8, v2, Ly3/q;->d:I

    .line 763
    .line 764
    iput v9, v2, Ly3/q;->e:I

    .line 765
    .line 766
    iget-object v4, v2, Ly3/q;->g:[I

    .line 767
    .line 768
    array-length v4, v4

    .line 769
    if-ge v4, v8, :cond_1d

    .line 770
    .line 771
    new-array v4, v8, [J

    .line 772
    .line 773
    iput-object v4, v2, Ly3/q;->f:[J

    .line 774
    .line 775
    new-array v4, v8, [I

    .line 776
    .line 777
    iput-object v4, v2, Ly3/q;->g:[I

    .line 778
    .line 779
    :cond_1d
    iget-object v4, v2, Ly3/q;->h:[I

    .line 780
    .line 781
    array-length v4, v4

    .line 782
    if-ge v4, v9, :cond_1e

    .line 783
    .line 784
    mul-int/lit8 v9, v9, 0x7d

    .line 785
    .line 786
    div-int/lit8 v9, v9, 0x64

    .line 787
    .line 788
    new-array v4, v9, [I

    .line 789
    .line 790
    iput-object v4, v2, Ly3/q;->h:[I

    .line 791
    .line 792
    new-array v4, v9, [J

    .line 793
    .line 794
    iput-object v4, v2, Ly3/q;->i:[J

    .line 795
    .line 796
    new-array v4, v9, [Z

    .line 797
    .line 798
    iput-object v4, v2, Ly3/q;->j:[Z

    .line 799
    .line 800
    new-array v4, v9, [Z

    .line 801
    .line 802
    iput-object v4, v2, Ly3/q;->l:[Z

    .line 803
    .line 804
    :cond_1e
    const/4 v5, 0x0

    .line 805
    const/4 v8, 0x0

    .line 806
    const/4 v9, 0x0

    .line 807
    :goto_1d
    const-wide/16 v28, 0x0

    .line 808
    .line 809
    if-ge v5, v7, :cond_34

    .line 810
    .line 811
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v4

    .line 815
    check-cast v4, Ly3/b;

    .line 816
    .line 817
    move/from16 v30, v5

    .line 818
    .line 819
    iget v5, v4, LQ0/b;->b:I

    .line 820
    .line 821
    if-ne v5, v13, :cond_33

    .line 822
    .line 823
    const/16 v21, 0x1

    .line 824
    .line 825
    add-int/lit8 v5, v8, 0x1

    .line 826
    .line 827
    iget-object v4, v4, Ly3/b;->c:LA4/r;

    .line 828
    .line 829
    const/16 v13, 0x8

    .line 830
    .line 831
    invoke-virtual {v4, v13}, LA4/r;->H(I)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v4}, LA4/r;->i()I

    .line 835
    .line 836
    .line 837
    move-result v13

    .line 838
    move-object/from16 v31, v4

    .line 839
    .line 840
    iget-object v4, v14, Ly3/h;->d:Ly3/r;

    .line 841
    .line 842
    move/from16 v32, v5

    .line 843
    .line 844
    iget-object v5, v2, Ly3/q;->a:Ly3/f;

    .line 845
    .line 846
    sget v33, Ll4/y;->a:I

    .line 847
    .line 848
    move/from16 v33, v6

    .line 849
    .line 850
    iget-object v6, v2, Ly3/q;->g:[I

    .line 851
    .line 852
    invoke-virtual/range {v31 .. v31}, LA4/r;->A()I

    .line 853
    .line 854
    .line 855
    move-result v34

    .line 856
    aput v34, v6, v8

    .line 857
    .line 858
    iget-object v6, v2, Ly3/q;->f:[J

    .line 859
    .line 860
    move-object/from16 v35, v6

    .line 861
    .line 862
    move/from16 v34, v7

    .line 863
    .line 864
    iget-wide v6, v2, Ly3/q;->b:J

    .line 865
    .line 866
    aput-wide v6, v35, v8

    .line 867
    .line 868
    const/16 v21, 0x1

    .line 869
    .line 870
    and-int/lit8 v36, v13, 0x1

    .line 871
    .line 872
    if-eqz v36, :cond_1f

    .line 873
    .line 874
    move-wide/from16 v36, v6

    .line 875
    .line 876
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 877
    .line 878
    .line 879
    move-result v6

    .line 880
    int-to-long v6, v6

    .line 881
    add-long v6, v36, v6

    .line 882
    .line 883
    aput-wide v6, v35, v8

    .line 884
    .line 885
    :cond_1f
    and-int/lit8 v6, v13, 0x4

    .line 886
    .line 887
    if-eqz v6, :cond_20

    .line 888
    .line 889
    const/4 v6, 0x1

    .line 890
    goto :goto_1e

    .line 891
    :cond_20
    const/4 v6, 0x0

    .line 892
    :goto_1e
    iget v7, v5, Ly3/f;->d:I

    .line 893
    .line 894
    if-eqz v6, :cond_21

    .line 895
    .line 896
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    :cond_21
    move/from16 v35, v6

    .line 901
    .line 902
    and-int/lit16 v6, v13, 0x100

    .line 903
    .line 904
    if-eqz v6, :cond_22

    .line 905
    .line 906
    const/4 v6, 0x1

    .line 907
    goto :goto_1f

    .line 908
    :cond_22
    const/4 v6, 0x0

    .line 909
    :goto_1f
    move/from16 v36, v6

    .line 910
    .line 911
    and-int/lit16 v6, v13, 0x200

    .line 912
    .line 913
    if-eqz v6, :cond_23

    .line 914
    .line 915
    const/4 v6, 0x1

    .line 916
    goto :goto_20

    .line 917
    :cond_23
    const/4 v6, 0x0

    .line 918
    :goto_20
    move/from16 v37, v6

    .line 919
    .line 920
    and-int/lit16 v6, v13, 0x400

    .line 921
    .line 922
    if-eqz v6, :cond_24

    .line 923
    .line 924
    const/4 v6, 0x1

    .line 925
    goto :goto_21

    .line 926
    :cond_24
    const/4 v6, 0x0

    .line 927
    :goto_21
    and-int/lit16 v13, v13, 0x800

    .line 928
    .line 929
    if-eqz v13, :cond_25

    .line 930
    .line 931
    const/4 v13, 0x1

    .line 932
    goto :goto_22

    .line 933
    :cond_25
    const/4 v13, 0x0

    .line 934
    :goto_22
    iget-object v4, v4, Ly3/r;->a:Ly3/o;

    .line 935
    .line 936
    move/from16 v38, v6

    .line 937
    .line 938
    iget-object v6, v4, Ly3/o;->h:[J

    .line 939
    .line 940
    move/from16 v39, v7

    .line 941
    .line 942
    if-eqz v6, :cond_26

    .line 943
    .line 944
    array-length v7, v6

    .line 945
    move-object/from16 v40, v6

    .line 946
    .line 947
    const/4 v6, 0x1

    .line 948
    if-ne v7, v6, :cond_26

    .line 949
    .line 950
    const/16 v20, 0x0

    .line 951
    .line 952
    aget-wide v6, v40, v20

    .line 953
    .line 954
    cmp-long v6, v6, v28

    .line 955
    .line 956
    if-nez v6, :cond_26

    .line 957
    .line 958
    iget-object v6, v4, Ly3/o;->i:[J

    .line 959
    .line 960
    aget-wide v28, v6, v20

    .line 961
    .line 962
    :cond_26
    iget-object v6, v2, Ly3/q;->h:[I

    .line 963
    .line 964
    iget-object v7, v2, Ly3/q;->i:[J

    .line 965
    .line 966
    move-object/from16 v40, v6

    .line 967
    .line 968
    iget-object v6, v2, Ly3/q;->j:[Z

    .line 969
    .line 970
    move-object/from16 v41, v6

    .line 971
    .line 972
    iget v6, v4, Ly3/o;->b:I

    .line 973
    .line 974
    move-object/from16 v42, v7

    .line 975
    .line 976
    move/from16 v7, v17

    .line 977
    .line 978
    if-ne v6, v7, :cond_27

    .line 979
    .line 980
    const/16 v21, 0x1

    .line 981
    .line 982
    and-int/lit8 v6, v12, 0x1

    .line 983
    .line 984
    if-eqz v6, :cond_27

    .line 985
    .line 986
    const/4 v6, 0x1

    .line 987
    goto :goto_23

    .line 988
    :cond_27
    const/4 v6, 0x0

    .line 989
    :goto_23
    iget-object v7, v2, Ly3/q;->g:[I

    .line 990
    .line 991
    aget v7, v7, v8

    .line 992
    .line 993
    add-int/2addr v7, v9

    .line 994
    move/from16 v43, v9

    .line 995
    .line 996
    iget-wide v8, v2, Ly3/q;->p:J

    .line 997
    .line 998
    move/from16 v44, v6

    .line 999
    .line 1000
    move/from16 v6, v43

    .line 1001
    .line 1002
    :goto_24
    if-ge v6, v7, :cond_32

    .line 1003
    .line 1004
    if-eqz v36, :cond_28

    .line 1005
    .line 1006
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 1007
    .line 1008
    .line 1009
    move-result v43

    .line 1010
    move/from16 v45, v43

    .line 1011
    .line 1012
    move/from16 v43, v6

    .line 1013
    .line 1014
    move/from16 v6, v45

    .line 1015
    .line 1016
    :goto_25
    move/from16 v45, v7

    .line 1017
    .line 1018
    goto :goto_26

    .line 1019
    :cond_28
    move/from16 v43, v6

    .line 1020
    .line 1021
    iget v6, v5, Ly3/f;->b:I

    .line 1022
    .line 1023
    goto :goto_25

    .line 1024
    :goto_26
    const-string v7, "Unexpected negative value: "

    .line 1025
    .line 1026
    if-ltz v6, :cond_31

    .line 1027
    .line 1028
    if-eqz v37, :cond_29

    .line 1029
    .line 1030
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 1031
    .line 1032
    .line 1033
    move-result v46

    .line 1034
    move/from16 v56, v46

    .line 1035
    .line 1036
    move/from16 v46, v10

    .line 1037
    .line 1038
    move/from16 v10, v56

    .line 1039
    .line 1040
    goto :goto_27

    .line 1041
    :cond_29
    move/from16 v46, v10

    .line 1042
    .line 1043
    iget v10, v5, Ly3/f;->c:I

    .line 1044
    .line 1045
    :goto_27
    if-ltz v10, :cond_30

    .line 1046
    .line 1047
    if-eqz v38, :cond_2a

    .line 1048
    .line 1049
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 1050
    .line 1051
    .line 1052
    move-result v7

    .line 1053
    goto :goto_28

    .line 1054
    :cond_2a
    if-nez v43, :cond_2b

    .line 1055
    .line 1056
    if-eqz v35, :cond_2b

    .line 1057
    .line 1058
    move/from16 v7, v39

    .line 1059
    .line 1060
    goto :goto_28

    .line 1061
    :cond_2b
    iget v7, v5, Ly3/f;->d:I

    .line 1062
    .line 1063
    :goto_28
    if-eqz v13, :cond_2c

    .line 1064
    .line 1065
    invoke-virtual/range {v31 .. v31}, LA4/r;->i()I

    .line 1066
    .line 1067
    .line 1068
    move-result v47

    .line 1069
    move/from16 v48, v47

    .line 1070
    .line 1071
    move-object/from16 v47, v5

    .line 1072
    .line 1073
    move/from16 v5, v48

    .line 1074
    .line 1075
    :goto_29
    move-object/from16 v48, v11

    .line 1076
    .line 1077
    move/from16 v49, v12

    .line 1078
    .line 1079
    goto :goto_2a

    .line 1080
    :cond_2c
    move-object/from16 v47, v5

    .line 1081
    .line 1082
    const/4 v5, 0x0

    .line 1083
    goto :goto_29

    .line 1084
    :goto_2a
    int-to-long v11, v5

    .line 1085
    add-long/2addr v11, v8

    .line 1086
    sub-long v50, v11, v28

    .line 1087
    .line 1088
    const-wide/32 v52, 0xf4240

    .line 1089
    .line 1090
    .line 1091
    iget-wide v11, v4, Ly3/o;->c:J

    .line 1092
    .line 1093
    move-wide/from16 v54, v11

    .line 1094
    .line 1095
    invoke-static/range {v50 .. v55}, Ll4/y;->O(JJJ)J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v11

    .line 1099
    aput-wide v11, v42, v43

    .line 1100
    .line 1101
    iget-boolean v5, v2, Ly3/q;->q:Z

    .line 1102
    .line 1103
    if-nez v5, :cond_2d

    .line 1104
    .line 1105
    iget-object v5, v14, Ly3/h;->d:Ly3/r;

    .line 1106
    .line 1107
    move-object/from16 v50, v4

    .line 1108
    .line 1109
    iget-wide v4, v5, Ly3/r;->h:J

    .line 1110
    .line 1111
    add-long/2addr v11, v4

    .line 1112
    aput-wide v11, v42, v43

    .line 1113
    .line 1114
    goto :goto_2b

    .line 1115
    :cond_2d
    move-object/from16 v50, v4

    .line 1116
    .line 1117
    :goto_2b
    aput v10, v40, v43

    .line 1118
    .line 1119
    shr-int/lit8 v4, v7, 0x10

    .line 1120
    .line 1121
    const/16 v21, 0x1

    .line 1122
    .line 1123
    and-int/lit8 v4, v4, 0x1

    .line 1124
    .line 1125
    if-nez v4, :cond_2f

    .line 1126
    .line 1127
    if-eqz v44, :cond_2e

    .line 1128
    .line 1129
    if-nez v43, :cond_2f

    .line 1130
    .line 1131
    :cond_2e
    const/4 v4, 0x1

    .line 1132
    goto :goto_2c

    .line 1133
    :cond_2f
    const/4 v4, 0x0

    .line 1134
    :goto_2c
    aput-boolean v4, v41, v43

    .line 1135
    .line 1136
    int-to-long v4, v6

    .line 1137
    add-long/2addr v8, v4

    .line 1138
    const/16 v21, 0x1

    .line 1139
    .line 1140
    add-int/lit8 v6, v43, 0x1

    .line 1141
    .line 1142
    move/from16 v7, v45

    .line 1143
    .line 1144
    move/from16 v10, v46

    .line 1145
    .line 1146
    move-object/from16 v5, v47

    .line 1147
    .line 1148
    move-object/from16 v11, v48

    .line 1149
    .line 1150
    move/from16 v12, v49

    .line 1151
    .line 1152
    move-object/from16 v4, v50

    .line 1153
    .line 1154
    goto/16 :goto_24

    .line 1155
    .line 1156
    :cond_30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    const/4 v4, 0x0

    .line 1169
    invoke-static {v1, v4}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v1

    .line 1173
    throw v1

    .line 1174
    :cond_31
    const/4 v4, 0x0

    .line 1175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1176
    .line 1177
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    invoke-static {v1, v4}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    throw v1

    .line 1192
    :cond_32
    move/from16 v45, v7

    .line 1193
    .line 1194
    move/from16 v46, v10

    .line 1195
    .line 1196
    move-object/from16 v48, v11

    .line 1197
    .line 1198
    move/from16 v49, v12

    .line 1199
    .line 1200
    iput-wide v8, v2, Ly3/q;->p:J

    .line 1201
    .line 1202
    move/from16 v8, v32

    .line 1203
    .line 1204
    move/from16 v9, v45

    .line 1205
    .line 1206
    :goto_2d
    const/16 v21, 0x1

    .line 1207
    .line 1208
    goto :goto_2e

    .line 1209
    :cond_33
    move/from16 v33, v6

    .line 1210
    .line 1211
    move/from16 v34, v7

    .line 1212
    .line 1213
    move/from16 v43, v9

    .line 1214
    .line 1215
    move/from16 v46, v10

    .line 1216
    .line 1217
    move-object/from16 v48, v11

    .line 1218
    .line 1219
    move/from16 v49, v12

    .line 1220
    .line 1221
    goto :goto_2d

    .line 1222
    :goto_2e
    add-int/lit8 v5, v30, 0x1

    .line 1223
    .line 1224
    move/from16 v6, v33

    .line 1225
    .line 1226
    move/from16 v7, v34

    .line 1227
    .line 1228
    move/from16 v10, v46

    .line 1229
    .line 1230
    move-object/from16 v11, v48

    .line 1231
    .line 1232
    move/from16 v12, v49

    .line 1233
    .line 1234
    const v13, 0x7472756e

    .line 1235
    .line 1236
    .line 1237
    const/16 v17, 0x2

    .line 1238
    .line 1239
    goto/16 :goto_1d

    .line 1240
    .line 1241
    :cond_34
    move/from16 v33, v6

    .line 1242
    .line 1243
    move/from16 v46, v10

    .line 1244
    .line 1245
    move-object/from16 v48, v11

    .line 1246
    .line 1247
    move/from16 v49, v12

    .line 1248
    .line 1249
    iget-object v5, v14, Ly3/h;->d:Ly3/r;

    .line 1250
    .line 1251
    iget-object v6, v2, Ly3/q;->a:Ly3/f;

    .line 1252
    .line 1253
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    iget-object v5, v5, Ly3/r;->a:Ly3/o;

    .line 1257
    .line 1258
    iget-object v5, v5, Ly3/o;->k:[Ly3/p;

    .line 1259
    .line 1260
    if-nez v5, :cond_35

    .line 1261
    .line 1262
    const/4 v5, 0x0

    .line 1263
    goto :goto_2f

    .line 1264
    :cond_35
    iget v6, v6, Ly3/f;->a:I

    .line 1265
    .line 1266
    aget-object v5, v5, v6

    .line 1267
    .line 1268
    :goto_2f
    const v6, 0x7361697a

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v15, v6}, Ly3/a;->s(I)Ly3/b;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v6

    .line 1275
    if-eqz v6, :cond_3c

    .line 1276
    .line 1277
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1278
    .line 1279
    .line 1280
    iget-object v6, v6, Ly3/b;->c:LA4/r;

    .line 1281
    .line 1282
    const/16 v13, 0x8

    .line 1283
    .line 1284
    invoke-virtual {v6, v13}, LA4/r;->H(I)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v6}, LA4/r;->i()I

    .line 1288
    .line 1289
    .line 1290
    move-result v7

    .line 1291
    const/4 v12, 0x1

    .line 1292
    and-int/2addr v7, v12

    .line 1293
    if-ne v7, v12, :cond_36

    .line 1294
    .line 1295
    invoke-virtual {v6, v13}, LA4/r;->I(I)V

    .line 1296
    .line 1297
    .line 1298
    :cond_36
    invoke-virtual {v6}, LA4/r;->x()I

    .line 1299
    .line 1300
    .line 1301
    move-result v7

    .line 1302
    invoke-virtual {v6}, LA4/r;->A()I

    .line 1303
    .line 1304
    .line 1305
    move-result v8

    .line 1306
    iget v9, v2, Ly3/q;->e:I

    .line 1307
    .line 1308
    if-gt v8, v9, :cond_3b

    .line 1309
    .line 1310
    iget v9, v5, Ly3/p;->d:I

    .line 1311
    .line 1312
    if-nez v7, :cond_39

    .line 1313
    .line 1314
    iget-object v7, v2, Ly3/q;->l:[Z

    .line 1315
    .line 1316
    const/4 v10, 0x0

    .line 1317
    const/4 v11, 0x0

    .line 1318
    :goto_30
    if-ge v10, v8, :cond_38

    .line 1319
    .line 1320
    invoke-virtual {v6}, LA4/r;->x()I

    .line 1321
    .line 1322
    .line 1323
    move-result v12

    .line 1324
    add-int/2addr v11, v12

    .line 1325
    if-le v12, v9, :cond_37

    .line 1326
    .line 1327
    const/4 v12, 0x1

    .line 1328
    goto :goto_31

    .line 1329
    :cond_37
    const/4 v12, 0x0

    .line 1330
    :goto_31
    aput-boolean v12, v7, v10

    .line 1331
    .line 1332
    const/16 v21, 0x1

    .line 1333
    .line 1334
    add-int/lit8 v10, v10, 0x1

    .line 1335
    .line 1336
    goto :goto_30

    .line 1337
    :cond_38
    const/4 v10, 0x0

    .line 1338
    goto :goto_33

    .line 1339
    :cond_39
    if-le v7, v9, :cond_3a

    .line 1340
    .line 1341
    const/4 v6, 0x1

    .line 1342
    goto :goto_32

    .line 1343
    :cond_3a
    const/4 v6, 0x0

    .line 1344
    :goto_32
    mul-int v11, v7, v8

    .line 1345
    .line 1346
    iget-object v7, v2, Ly3/q;->l:[Z

    .line 1347
    .line 1348
    const/4 v10, 0x0

    .line 1349
    invoke-static {v7, v10, v8, v6}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1350
    .line 1351
    .line 1352
    :goto_33
    iget-object v6, v2, Ly3/q;->l:[Z

    .line 1353
    .line 1354
    iget v7, v2, Ly3/q;->e:I

    .line 1355
    .line 1356
    invoke-static {v6, v8, v7, v10}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1357
    .line 1358
    .line 1359
    if-lez v11, :cond_3c

    .line 1360
    .line 1361
    iget-object v6, v2, Ly3/q;->n:LA4/r;

    .line 1362
    .line 1363
    invoke-virtual {v6, v11}, LA4/r;->E(I)V

    .line 1364
    .line 1365
    .line 1366
    const/4 v12, 0x1

    .line 1367
    iput-boolean v12, v2, Ly3/q;->k:Z

    .line 1368
    .line 1369
    iput-boolean v12, v2, Ly3/q;->o:Z

    .line 1370
    .line 1371
    goto :goto_34

    .line 1372
    :cond_3b
    const-string v1, "Saiz sample count "

    .line 1373
    .line 1374
    const-string v3, " is greater than fragment sample count"

    .line 1375
    .line 1376
    invoke-static {v1, v8, v3}, LA0/a;->p(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    iget v2, v2, Ly3/q;->e:I

    .line 1381
    .line 1382
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    const/4 v4, 0x0

    .line 1390
    invoke-static {v1, v4}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    throw v1

    .line 1395
    :cond_3c
    :goto_34
    const v6, 0x7361696f

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v15, v6}, Ly3/a;->s(I)Ly3/b;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v6

    .line 1402
    if-eqz v6, :cond_3f

    .line 1403
    .line 1404
    iget-object v6, v6, Ly3/b;->c:LA4/r;

    .line 1405
    .line 1406
    const/16 v13, 0x8

    .line 1407
    .line 1408
    invoke-virtual {v6, v13}, LA4/r;->H(I)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v6}, LA4/r;->i()I

    .line 1412
    .line 1413
    .line 1414
    move-result v7

    .line 1415
    const/4 v12, 0x1

    .line 1416
    and-int/lit8 v8, v7, 0x1

    .line 1417
    .line 1418
    if-ne v8, v12, :cond_3d

    .line 1419
    .line 1420
    invoke-virtual {v6, v13}, LA4/r;->I(I)V

    .line 1421
    .line 1422
    .line 1423
    :cond_3d
    invoke-virtual {v6}, LA4/r;->A()I

    .line 1424
    .line 1425
    .line 1426
    move-result v8

    .line 1427
    if-ne v8, v12, :cond_40

    .line 1428
    .line 1429
    invoke-static {v7}, LQ0/b;->q(I)I

    .line 1430
    .line 1431
    .line 1432
    move-result v7

    .line 1433
    iget-wide v8, v2, Ly3/q;->c:J

    .line 1434
    .line 1435
    if-nez v7, :cond_3e

    .line 1436
    .line 1437
    invoke-virtual {v6}, LA4/r;->y()J

    .line 1438
    .line 1439
    .line 1440
    move-result-wide v6

    .line 1441
    goto :goto_35

    .line 1442
    :cond_3e
    invoke-virtual {v6}, LA4/r;->B()J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v6

    .line 1446
    :goto_35
    add-long/2addr v8, v6

    .line 1447
    iput-wide v8, v2, Ly3/q;->c:J

    .line 1448
    .line 1449
    :cond_3f
    const/4 v4, 0x0

    .line 1450
    goto :goto_36

    .line 1451
    :cond_40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    const-string v2, "Unexpected saio entry count: "

    .line 1454
    .line 1455
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    const/4 v4, 0x0

    .line 1466
    invoke-static {v1, v4}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    throw v1

    .line 1471
    :goto_36
    const v6, 0x73656e63

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v15, v6}, Ly3/a;->s(I)Ly3/b;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v6

    .line 1478
    if-eqz v6, :cond_41

    .line 1479
    .line 1480
    iget-object v6, v6, Ly3/b;->c:LA4/r;

    .line 1481
    .line 1482
    const/4 v10, 0x0

    .line 1483
    invoke-static {v6, v10, v2}, Ly3/i;->d(LA4/r;ILy3/q;)V

    .line 1484
    .line 1485
    .line 1486
    :cond_41
    if-eqz v5, :cond_42

    .line 1487
    .line 1488
    iget-object v5, v5, Ly3/p;->b:Ljava/lang/String;

    .line 1489
    .line 1490
    move-object v8, v5

    .line 1491
    goto :goto_37

    .line 1492
    :cond_42
    move-object v8, v4

    .line 1493
    :goto_37
    move-object v6, v4

    .line 1494
    move-object v7, v6

    .line 1495
    const/4 v5, 0x0

    .line 1496
    :goto_38
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1497
    .line 1498
    .line 1499
    move-result v9

    .line 1500
    if-ge v5, v9, :cond_45

    .line 1501
    .line 1502
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v9

    .line 1506
    check-cast v9, Ly3/b;

    .line 1507
    .line 1508
    iget-object v10, v9, Ly3/b;->c:LA4/r;

    .line 1509
    .line 1510
    const v11, 0x73626770

    .line 1511
    .line 1512
    .line 1513
    const v12, 0x73656967

    .line 1514
    .line 1515
    .line 1516
    iget v9, v9, LQ0/b;->b:I

    .line 1517
    .line 1518
    if-ne v9, v11, :cond_44

    .line 1519
    .line 1520
    const/16 v14, 0xc

    .line 1521
    .line 1522
    invoke-virtual {v10, v14}, LA4/r;->H(I)V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v10}, LA4/r;->i()I

    .line 1526
    .line 1527
    .line 1528
    move-result v9

    .line 1529
    if-ne v9, v12, :cond_43

    .line 1530
    .line 1531
    move-object v6, v10

    .line 1532
    :cond_43
    :goto_39
    const/4 v12, 0x1

    .line 1533
    goto :goto_3a

    .line 1534
    :cond_44
    const/16 v14, 0xc

    .line 1535
    .line 1536
    const v11, 0x73677064

    .line 1537
    .line 1538
    .line 1539
    if-ne v9, v11, :cond_43

    .line 1540
    .line 1541
    invoke-virtual {v10, v14}, LA4/r;->H(I)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v10}, LA4/r;->i()I

    .line 1545
    .line 1546
    .line 1547
    move-result v9

    .line 1548
    if-ne v9, v12, :cond_43

    .line 1549
    .line 1550
    move-object v7, v10

    .line 1551
    goto :goto_39

    .line 1552
    :goto_3a
    add-int/2addr v5, v12

    .line 1553
    goto :goto_38

    .line 1554
    :cond_45
    const/4 v12, 0x1

    .line 1555
    const/16 v14, 0xc

    .line 1556
    .line 1557
    if-eqz v6, :cond_46

    .line 1558
    .line 1559
    if-nez v7, :cond_47

    .line 1560
    .line 1561
    :cond_46
    move/from16 v15, v19

    .line 1562
    .line 1563
    const/16 v17, 0x2

    .line 1564
    .line 1565
    goto/16 :goto_3f

    .line 1566
    .line 1567
    :cond_47
    const/16 v13, 0x8

    .line 1568
    .line 1569
    invoke-virtual {v6, v13}, LA4/r;->H(I)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v6}, LA4/r;->i()I

    .line 1573
    .line 1574
    .line 1575
    move-result v5

    .line 1576
    invoke-static {v5}, LQ0/b;->q(I)I

    .line 1577
    .line 1578
    .line 1579
    move-result v5

    .line 1580
    move/from16 v15, v19

    .line 1581
    .line 1582
    invoke-virtual {v6, v15}, LA4/r;->I(I)V

    .line 1583
    .line 1584
    .line 1585
    if-ne v5, v12, :cond_48

    .line 1586
    .line 1587
    invoke-virtual {v6, v15}, LA4/r;->I(I)V

    .line 1588
    .line 1589
    .line 1590
    :cond_48
    invoke-virtual {v6}, LA4/r;->i()I

    .line 1591
    .line 1592
    .line 1593
    move-result v5

    .line 1594
    if-ne v5, v12, :cond_50

    .line 1595
    .line 1596
    invoke-virtual {v7, v13}, LA4/r;->H(I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v7}, LA4/r;->i()I

    .line 1600
    .line 1601
    .line 1602
    move-result v5

    .line 1603
    invoke-static {v5}, LQ0/b;->q(I)I

    .line 1604
    .line 1605
    .line 1606
    move-result v5

    .line 1607
    invoke-virtual {v7, v15}, LA4/r;->I(I)V

    .line 1608
    .line 1609
    .line 1610
    if-ne v5, v12, :cond_4a

    .line 1611
    .line 1612
    invoke-virtual {v7}, LA4/r;->y()J

    .line 1613
    .line 1614
    .line 1615
    move-result-wide v5

    .line 1616
    cmp-long v5, v5, v28

    .line 1617
    .line 1618
    if-eqz v5, :cond_49

    .line 1619
    .line 1620
    const/4 v6, 0x2

    .line 1621
    goto :goto_3b

    .line 1622
    :cond_49
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1623
    .line 1624
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    throw v1

    .line 1629
    :cond_4a
    const/4 v6, 0x2

    .line 1630
    if-lt v5, v6, :cond_4b

    .line 1631
    .line 1632
    invoke-virtual {v7, v15}, LA4/r;->I(I)V

    .line 1633
    .line 1634
    .line 1635
    :cond_4b
    :goto_3b
    invoke-virtual {v7}, LA4/r;->y()J

    .line 1636
    .line 1637
    .line 1638
    move-result-wide v9

    .line 1639
    const-wide/16 v11, 0x1

    .line 1640
    .line 1641
    cmp-long v5, v9, v11

    .line 1642
    .line 1643
    if-nez v5, :cond_4f

    .line 1644
    .line 1645
    const/4 v12, 0x1

    .line 1646
    invoke-virtual {v7, v12}, LA4/r;->I(I)V

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v7}, LA4/r;->x()I

    .line 1650
    .line 1651
    .line 1652
    move-result v5

    .line 1653
    and-int/lit16 v9, v5, 0xf0

    .line 1654
    .line 1655
    shr-int/lit8 v11, v9, 0x4

    .line 1656
    .line 1657
    and-int/lit8 v5, v5, 0xf

    .line 1658
    .line 1659
    invoke-virtual {v7}, LA4/r;->x()I

    .line 1660
    .line 1661
    .line 1662
    move-result v9

    .line 1663
    if-ne v9, v12, :cond_4c

    .line 1664
    .line 1665
    const/4 v9, 0x1

    .line 1666
    goto :goto_3c

    .line 1667
    :cond_4c
    const/4 v9, 0x0

    .line 1668
    :goto_3c
    if-nez v9, :cond_4d

    .line 1669
    .line 1670
    move/from16 v17, v6

    .line 1671
    .line 1672
    goto :goto_3f

    .line 1673
    :cond_4d
    move v10, v9

    .line 1674
    invoke-virtual {v7}, LA4/r;->x()I

    .line 1675
    .line 1676
    .line 1677
    move-result v9

    .line 1678
    move v13, v10

    .line 1679
    move/from16 v12, v18

    .line 1680
    .line 1681
    new-array v10, v12, [B

    .line 1682
    .line 1683
    const/4 v4, 0x0

    .line 1684
    invoke-virtual {v7, v10, v4, v12}, LA4/r;->h([BII)V

    .line 1685
    .line 1686
    .line 1687
    if-nez v9, :cond_4e

    .line 1688
    .line 1689
    invoke-virtual {v7}, LA4/r;->x()I

    .line 1690
    .line 1691
    .line 1692
    move-result v12

    .line 1693
    new-array v6, v12, [B

    .line 1694
    .line 1695
    invoke-virtual {v7, v6, v4, v12}, LA4/r;->h([BII)V

    .line 1696
    .line 1697
    .line 1698
    move-object v7, v6

    .line 1699
    :goto_3d
    const/4 v12, 0x1

    .line 1700
    goto :goto_3e

    .line 1701
    :cond_4e
    const/4 v7, 0x0

    .line 1702
    goto :goto_3d

    .line 1703
    :goto_3e
    iput-boolean v12, v2, Ly3/q;->k:Z

    .line 1704
    .line 1705
    new-instance v6, Ly3/p;

    .line 1706
    .line 1707
    move v12, v13

    .line 1708
    move-object v13, v7

    .line 1709
    move v7, v12

    .line 1710
    move v12, v5

    .line 1711
    const/16 v17, 0x2

    .line 1712
    .line 1713
    invoke-direct/range {v6 .. v13}, Ly3/p;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1714
    .line 1715
    .line 1716
    iput-object v6, v2, Ly3/q;->m:Ly3/p;

    .line 1717
    .line 1718
    goto :goto_3f

    .line 1719
    :cond_4f
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1720
    .line 1721
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    throw v1

    .line 1726
    :cond_50
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1727
    .line 1728
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v1

    .line 1732
    throw v1

    .line 1733
    :goto_3f
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1734
    .line 1735
    .line 1736
    move-result v4

    .line 1737
    const/4 v10, 0x0

    .line 1738
    :goto_40
    if-ge v10, v4, :cond_53

    .line 1739
    .line 1740
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v5

    .line 1744
    check-cast v5, Ly3/b;

    .line 1745
    .line 1746
    iget v6, v5, LQ0/b;->b:I

    .line 1747
    .line 1748
    const v7, 0x75756964

    .line 1749
    .line 1750
    .line 1751
    if-ne v6, v7, :cond_52

    .line 1752
    .line 1753
    iget-object v5, v5, Ly3/b;->c:LA4/r;

    .line 1754
    .line 1755
    const/16 v13, 0x8

    .line 1756
    .line 1757
    invoke-virtual {v5, v13}, LA4/r;->H(I)V

    .line 1758
    .line 1759
    .line 1760
    iget-object v6, v0, Ly3/i;->h:[B

    .line 1761
    .line 1762
    const/4 v7, 0x0

    .line 1763
    const/16 v12, 0x10

    .line 1764
    .line 1765
    invoke-virtual {v5, v6, v7, v12}, LA4/r;->h([BII)V

    .line 1766
    .line 1767
    .line 1768
    sget-object v7, Ly3/i;->I:[B

    .line 1769
    .line 1770
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v6

    .line 1774
    if-nez v6, :cond_51

    .line 1775
    .line 1776
    goto :goto_41

    .line 1777
    :cond_51
    invoke-static {v5, v12, v2}, Ly3/i;->d(LA4/r;ILy3/q;)V

    .line 1778
    .line 1779
    .line 1780
    :goto_41
    const/16 v21, 0x1

    .line 1781
    .line 1782
    goto :goto_42

    .line 1783
    :cond_52
    const/16 v12, 0x10

    .line 1784
    .line 1785
    const/16 v13, 0x8

    .line 1786
    .line 1787
    goto :goto_41

    .line 1788
    :goto_42
    add-int/lit8 v10, v10, 0x1

    .line 1789
    .line 1790
    goto :goto_40

    .line 1791
    :cond_53
    const/16 v12, 0x10

    .line 1792
    .line 1793
    goto/16 :goto_18

    .line 1794
    .line 1795
    :cond_54
    move/from16 v26, v2

    .line 1796
    .line 1797
    move-object/from16 v27, v5

    .line 1798
    .line 1799
    move/from16 v33, v6

    .line 1800
    .line 1801
    move/from16 v46, v10

    .line 1802
    .line 1803
    move-object/from16 v48, v11

    .line 1804
    .line 1805
    move/from16 v49, v12

    .line 1806
    .line 1807
    move/from16 v12, v18

    .line 1808
    .line 1809
    move/from16 v15, v19

    .line 1810
    .line 1811
    const/16 v13, 0x8

    .line 1812
    .line 1813
    const/16 v14, 0xc

    .line 1814
    .line 1815
    const/16 v21, 0x1

    .line 1816
    .line 1817
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    :goto_43
    add-int/lit8 v10, v46, 0x1

    .line 1823
    .line 1824
    move/from16 v18, v12

    .line 1825
    .line 1826
    move/from16 v19, v15

    .line 1827
    .line 1828
    move/from16 v2, v26

    .line 1829
    .line 1830
    move-object/from16 v5, v27

    .line 1831
    .line 1832
    move/from16 v6, v33

    .line 1833
    .line 1834
    move-object/from16 v11, v48

    .line 1835
    .line 1836
    move/from16 v12, v49

    .line 1837
    .line 1838
    goto/16 :goto_e

    .line 1839
    .line 1840
    :cond_55
    move-object/from16 v48, v11

    .line 1841
    .line 1842
    move/from16 v12, v18

    .line 1843
    .line 1844
    move/from16 v15, v19

    .line 1845
    .line 1846
    const/16 v13, 0x8

    .line 1847
    .line 1848
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    invoke-static/range {v48 .. v48}, Ly3/i;->c(Ljava/util/ArrayList;)Ln3/g;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v2

    .line 1857
    if-eqz v2, :cond_58

    .line 1858
    .line 1859
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1860
    .line 1861
    .line 1862
    move-result v3

    .line 1863
    const/4 v10, 0x0

    .line 1864
    :goto_44
    if-ge v10, v3, :cond_58

    .line 1865
    .line 1866
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v4

    .line 1870
    check-cast v4, Ly3/h;

    .line 1871
    .line 1872
    iget-object v5, v4, Ly3/h;->d:Ly3/r;

    .line 1873
    .line 1874
    iget-object v6, v4, Ly3/h;->b:Ly3/q;

    .line 1875
    .line 1876
    iget-object v6, v6, Ly3/q;->a:Ly3/f;

    .line 1877
    .line 1878
    sget v7, Ll4/y;->a:I

    .line 1879
    .line 1880
    iget v6, v6, Ly3/f;->a:I

    .line 1881
    .line 1882
    iget-object v5, v5, Ly3/r;->a:Ly3/o;

    .line 1883
    .line 1884
    iget-object v5, v5, Ly3/o;->k:[Ly3/p;

    .line 1885
    .line 1886
    if-nez v5, :cond_56

    .line 1887
    .line 1888
    const/4 v5, 0x0

    .line 1889
    goto :goto_45

    .line 1890
    :cond_56
    aget-object v5, v5, v6

    .line 1891
    .line 1892
    :goto_45
    if-eqz v5, :cond_57

    .line 1893
    .line 1894
    iget-object v5, v5, Ly3/p;->b:Ljava/lang/String;

    .line 1895
    .line 1896
    goto :goto_46

    .line 1897
    :cond_57
    const/4 v5, 0x0

    .line 1898
    :goto_46
    invoke-virtual {v2, v5}, Ln3/g;->a(Ljava/lang/String;)Ln3/g;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v5

    .line 1902
    iget-object v6, v4, Ly3/h;->d:Ly3/r;

    .line 1903
    .line 1904
    iget-object v6, v6, Ly3/r;->a:Ly3/o;

    .line 1905
    .line 1906
    iget-object v6, v6, Ly3/o;->f:Lj3/M;

    .line 1907
    .line 1908
    invoke-virtual {v6}, Lj3/M;->a()Lj3/L;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v6

    .line 1912
    iput-object v5, v6, Lj3/L;->n:Ln3/g;

    .line 1913
    .line 1914
    new-instance v5, Lj3/M;

    .line 1915
    .line 1916
    invoke-direct {v5, v6}, Lj3/M;-><init>(Lj3/L;)V

    .line 1917
    .line 1918
    .line 1919
    iget-object v4, v4, Ly3/h;->a:Lq3/u;

    .line 1920
    .line 1921
    invoke-interface {v4, v5}, Lq3/u;->e(Lj3/M;)V

    .line 1922
    .line 1923
    .line 1924
    const/16 v21, 0x1

    .line 1925
    .line 1926
    add-int/lit8 v10, v10, 0x1

    .line 1927
    .line 1928
    goto :goto_44

    .line 1929
    :cond_58
    iget-wide v2, v0, Ly3/i;->w:J

    .line 1930
    .line 1931
    cmp-long v2, v2, v23

    .line 1932
    .line 1933
    if-eqz v2, :cond_d

    .line 1934
    .line 1935
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1936
    .line 1937
    .line 1938
    move-result v2

    .line 1939
    const/4 v8, 0x0

    .line 1940
    :goto_47
    if-ge v8, v2, :cond_5b

    .line 1941
    .line 1942
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v3

    .line 1946
    check-cast v3, Ly3/h;

    .line 1947
    .line 1948
    iget-wide v4, v0, Ly3/i;->w:J

    .line 1949
    .line 1950
    iget v6, v3, Ly3/h;->f:I

    .line 1951
    .line 1952
    :goto_48
    iget-object v7, v3, Ly3/h;->b:Ly3/q;

    .line 1953
    .line 1954
    iget v9, v7, Ly3/q;->e:I

    .line 1955
    .line 1956
    if-ge v6, v9, :cond_5a

    .line 1957
    .line 1958
    iget-object v9, v7, Ly3/q;->i:[J

    .line 1959
    .line 1960
    aget-wide v10, v9, v6

    .line 1961
    .line 1962
    cmp-long v9, v10, v4

    .line 1963
    .line 1964
    if-gez v9, :cond_5a

    .line 1965
    .line 1966
    iget-object v7, v7, Ly3/q;->j:[Z

    .line 1967
    .line 1968
    aget-boolean v7, v7, v6

    .line 1969
    .line 1970
    if-eqz v7, :cond_59

    .line 1971
    .line 1972
    iput v6, v3, Ly3/h;->i:I

    .line 1973
    .line 1974
    :cond_59
    const/16 v21, 0x1

    .line 1975
    .line 1976
    add-int/lit8 v6, v6, 0x1

    .line 1977
    .line 1978
    goto :goto_48

    .line 1979
    :cond_5a
    const/16 v21, 0x1

    .line 1980
    .line 1981
    add-int/lit8 v8, v8, 0x1

    .line 1982
    .line 1983
    goto :goto_47

    .line 1984
    :cond_5b
    move-wide/from16 v3, v23

    .line 1985
    .line 1986
    const/16 v21, 0x1

    .line 1987
    .line 1988
    iput-wide v3, v0, Ly3/i;->w:J

    .line 1989
    .line 1990
    goto/16 :goto_0

    .line 1991
    .line 1992
    :cond_5c
    move/from16 v12, v18

    .line 1993
    .line 1994
    move/from16 v15, v19

    .line 1995
    .line 1996
    const/16 v13, 0x8

    .line 1997
    .line 1998
    const/16 v21, 0x1

    .line 1999
    .line 2000
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2001
    .line 2002
    .line 2003
    move-result v1

    .line 2004
    if-nez v1, :cond_0

    .line 2005
    .line 2006
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v1

    .line 2010
    check-cast v1, Ly3/a;

    .line 2011
    .line 2012
    iget-object v1, v1, Ly3/a;->e:Ljava/util/ArrayList;

    .line 2013
    .line 2014
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2015
    .line 2016
    .line 2017
    goto/16 :goto_0

    .line 2018
    .line 2019
    :cond_5d
    const/4 v10, 0x0

    .line 2020
    iput v10, v0, Ly3/i;->p:I

    .line 2021
    .line 2022
    iput v10, v0, Ly3/i;->s:I

    .line 2023
    .line 2024
    return-void
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :goto_0
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_1
    iget v2, v0, Ly3/i;->p:I

    .line 6
    .line 7
    iget-object v3, v0, Ly3/i;->m:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v4, v0, Ly3/i;->d:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const v7, 0x656d7367

    .line 14
    .line 15
    .line 16
    const v8, 0x73696478

    .line 17
    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x2

    .line 21
    if-eqz v2, :cond_3d

    .line 22
    .line 23
    iget-object v12, v0, Ly3/i;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    iget-object v13, v0, Ly3/i;->j:Ll4/x;

    .line 26
    .line 27
    const-string v15, "FragmentedMp4Extractor"

    .line 28
    .line 29
    if-eq v2, v6, :cond_2d

    .line 30
    .line 31
    const-wide v7, 0x7fffffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    if-eq v2, v11, :cond_28

    .line 37
    .line 38
    iget-object v2, v0, Ly3/i;->z:Ly3/h;

    .line 39
    .line 40
    if-nez v2, :cond_9

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    move-wide/from16 v16, v7

    .line 47
    .line 48
    move-object v7, v10

    .line 49
    move v8, v5

    .line 50
    :goto_2
    if-ge v8, v2, :cond_4

    .line 51
    .line 52
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v18

    .line 56
    move/from16 p2, v11

    .line 57
    .line 58
    move-object/from16 v11, v18

    .line 59
    .line 60
    check-cast v11, Ly3/h;

    .line 61
    .line 62
    iget-boolean v14, v11, Ly3/h;->l:Z

    .line 63
    .line 64
    const/16 v19, 0x8

    .line 65
    .line 66
    if-nez v14, :cond_0

    .line 67
    .line 68
    iget v9, v11, Ly3/h;->f:I

    .line 69
    .line 70
    iget-object v6, v11, Ly3/h;->d:Ly3/r;

    .line 71
    .line 72
    iget v6, v6, Ly3/r;->b:I

    .line 73
    .line 74
    if-eq v9, v6, :cond_3

    .line 75
    .line 76
    :cond_0
    iget-object v6, v11, Ly3/h;->b:Ly3/q;

    .line 77
    .line 78
    if-eqz v14, :cond_1

    .line 79
    .line 80
    iget v9, v11, Ly3/h;->h:I

    .line 81
    .line 82
    iget v3, v6, Ly3/q;->d:I

    .line 83
    .line 84
    if-ne v9, v3, :cond_1

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_1
    if-nez v14, :cond_2

    .line 88
    .line 89
    iget-object v3, v11, Ly3/h;->d:Ly3/r;

    .line 90
    .line 91
    iget-object v3, v3, Ly3/r;->c:[J

    .line 92
    .line 93
    iget v6, v11, Ly3/h;->f:I

    .line 94
    .line 95
    aget-wide v22, v3, v6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_2
    iget-object v3, v6, Ly3/q;->f:[J

    .line 99
    .line 100
    iget v6, v11, Ly3/h;->h:I

    .line 101
    .line 102
    aget-wide v22, v3, v6

    .line 103
    .line 104
    :goto_3
    cmp-long v3, v22, v16

    .line 105
    .line 106
    if-gez v3, :cond_3

    .line 107
    .line 108
    move-object v7, v11

    .line 109
    move-wide/from16 v16, v22

    .line 110
    .line 111
    :cond_3
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 112
    .line 113
    move/from16 v11, p2

    .line 114
    .line 115
    const/4 v6, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move/from16 p2, v11

    .line 118
    .line 119
    const/16 v19, 0x8

    .line 120
    .line 121
    if-nez v7, :cond_6

    .line 122
    .line 123
    iget-wide v2, v0, Ly3/i;->u:J

    .line 124
    .line 125
    move-object v4, v1

    .line 126
    check-cast v4, Lq3/g;

    .line 127
    .line 128
    iget-wide v6, v4, Lq3/g;->d:J

    .line 129
    .line 130
    sub-long/2addr v2, v6

    .line 131
    long-to-int v2, v2

    .line 132
    if-ltz v2, :cond_5

    .line 133
    .line 134
    move-object v3, v1

    .line 135
    check-cast v3, Lq3/g;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Lq3/g;->n(I)V

    .line 138
    .line 139
    .line 140
    iput v5, v0, Ly3/i;->p:I

    .line 141
    .line 142
    iput v5, v0, Ly3/i;->s:I

    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    .line 147
    .line 148
    invoke-static {v1, v10}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    throw v1

    .line 153
    :cond_6
    iget-boolean v2, v7, Ly3/h;->l:Z

    .line 154
    .line 155
    if-nez v2, :cond_7

    .line 156
    .line 157
    iget-object v2, v7, Ly3/h;->d:Ly3/r;

    .line 158
    .line 159
    iget-object v2, v2, Ly3/r;->c:[J

    .line 160
    .line 161
    iget v3, v7, Ly3/h;->f:I

    .line 162
    .line 163
    aget-wide v3, v2, v3

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    iget-object v2, v7, Ly3/h;->b:Ly3/q;

    .line 167
    .line 168
    iget-object v2, v2, Ly3/q;->f:[J

    .line 169
    .line 170
    iget v3, v7, Ly3/h;->h:I

    .line 171
    .line 172
    aget-wide v3, v2, v3

    .line 173
    .line 174
    :goto_5
    move-object v2, v1

    .line 175
    check-cast v2, Lq3/g;

    .line 176
    .line 177
    iget-wide v8, v2, Lq3/g;->d:J

    .line 178
    .line 179
    sub-long/2addr v3, v8

    .line 180
    long-to-int v2, v3

    .line 181
    if-gez v2, :cond_8

    .line 182
    .line 183
    const-string v2, "Ignoring negative offset to sample data."

    .line 184
    .line 185
    invoke-static {v15, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move v2, v5

    .line 189
    :cond_8
    move-object v3, v1

    .line 190
    check-cast v3, Lq3/g;

    .line 191
    .line 192
    invoke-virtual {v3, v2}, Lq3/g;->n(I)V

    .line 193
    .line 194
    .line 195
    iput-object v7, v0, Ly3/i;->z:Ly3/h;

    .line 196
    .line 197
    move-object v2, v7

    .line 198
    goto :goto_6

    .line 199
    :cond_9
    move/from16 p2, v11

    .line 200
    .line 201
    const/16 v19, 0x8

    .line 202
    .line 203
    :goto_6
    iget v3, v0, Ly3/i;->p:I

    .line 204
    .line 205
    const/4 v4, 0x6

    .line 206
    iget-object v6, v2, Ly3/h;->b:Ly3/q;

    .line 207
    .line 208
    const/4 v7, 0x3

    .line 209
    if-ne v3, v7, :cond_12

    .line 210
    .line 211
    iget-boolean v3, v2, Ly3/h;->l:Z

    .line 212
    .line 213
    if-nez v3, :cond_a

    .line 214
    .line 215
    iget-object v3, v2, Ly3/h;->d:Ly3/r;

    .line 216
    .line 217
    iget-object v3, v3, Ly3/r;->d:[I

    .line 218
    .line 219
    iget v7, v2, Ly3/h;->f:I

    .line 220
    .line 221
    aget v3, v3, v7

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_a
    iget-object v3, v6, Ly3/q;->h:[I

    .line 225
    .line 226
    iget v7, v2, Ly3/h;->f:I

    .line 227
    .line 228
    aget v3, v3, v7

    .line 229
    .line 230
    :goto_7
    iput v3, v0, Ly3/i;->A:I

    .line 231
    .line 232
    iget v7, v2, Ly3/h;->f:I

    .line 233
    .line 234
    iget v8, v2, Ly3/h;->i:I

    .line 235
    .line 236
    if-ge v7, v8, :cond_f

    .line 237
    .line 238
    check-cast v1, Lq3/g;

    .line 239
    .line 240
    invoke-virtual {v1, v3}, Lq3/g;->n(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ly3/h;->a()Ly3/p;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-nez v1, :cond_b

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_b
    iget-object v3, v6, Ly3/q;->n:LA4/r;

    .line 251
    .line 252
    iget v1, v1, Ly3/p;->d:I

    .line 253
    .line 254
    if-eqz v1, :cond_c

    .line 255
    .line 256
    invoke-virtual {v3, v1}, LA4/r;->I(I)V

    .line 257
    .line 258
    .line 259
    :cond_c
    iget v1, v2, Ly3/h;->f:I

    .line 260
    .line 261
    iget-boolean v7, v6, Ly3/q;->k:Z

    .line 262
    .line 263
    if-eqz v7, :cond_d

    .line 264
    .line 265
    iget-object v6, v6, Ly3/q;->l:[Z

    .line 266
    .line 267
    aget-boolean v1, v6, v1

    .line 268
    .line 269
    if-eqz v1, :cond_d

    .line 270
    .line 271
    invoke-virtual {v3}, LA4/r;->C()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    mul-int/2addr v1, v4

    .line 276
    invoke-virtual {v3, v1}, LA4/r;->I(I)V

    .line 277
    .line 278
    .line 279
    :cond_d
    :goto_8
    invoke-virtual {v2}, Ly3/h;->b()Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-nez v1, :cond_e

    .line 284
    .line 285
    iput-object v10, v0, Ly3/i;->z:Ly3/h;

    .line 286
    .line 287
    :cond_e
    const/4 v7, 0x3

    .line 288
    iput v7, v0, Ly3/i;->p:I

    .line 289
    .line 290
    return v5

    .line 291
    :cond_f
    iget-object v7, v2, Ly3/h;->d:Ly3/r;

    .line 292
    .line 293
    iget-object v7, v7, Ly3/r;->a:Ly3/o;

    .line 294
    .line 295
    iget v7, v7, Ly3/o;->g:I

    .line 296
    .line 297
    const/4 v8, 0x1

    .line 298
    if-ne v7, v8, :cond_10

    .line 299
    .line 300
    add-int/lit8 v3, v3, -0x8

    .line 301
    .line 302
    iput v3, v0, Ly3/i;->A:I

    .line 303
    .line 304
    move-object v3, v1

    .line 305
    check-cast v3, Lq3/g;

    .line 306
    .line 307
    move/from16 v7, v19

    .line 308
    .line 309
    invoke-virtual {v3, v7}, Lq3/g;->n(I)V

    .line 310
    .line 311
    .line 312
    :cond_10
    iget-object v3, v2, Ly3/h;->d:Ly3/r;

    .line 313
    .line 314
    iget-object v3, v3, Ly3/r;->a:Ly3/o;

    .line 315
    .line 316
    iget-object v3, v3, Ly3/o;->f:Lj3/M;

    .line 317
    .line 318
    iget-object v3, v3, Lj3/M;->l:Ljava/lang/String;

    .line 319
    .line 320
    const-string v7, "audio/ac4"

    .line 321
    .line 322
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_11

    .line 327
    .line 328
    iget v3, v0, Ly3/i;->A:I

    .line 329
    .line 330
    const/4 v7, 0x7

    .line 331
    invoke-virtual {v2, v3, v7}, Ly3/h;->c(II)I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    iput v3, v0, Ly3/i;->B:I

    .line 336
    .line 337
    iget v3, v0, Ly3/i;->A:I

    .line 338
    .line 339
    iget-object v8, v0, Ly3/i;->i:LA4/r;

    .line 340
    .line 341
    invoke-static {v3, v8}, Ll3/a;->e(ILA4/r;)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v2, Ly3/h;->a:Lq3/u;

    .line 345
    .line 346
    invoke-interface {v3, v7, v8}, Lq3/u;->c(ILA4/r;)V

    .line 347
    .line 348
    .line 349
    iget v3, v0, Ly3/i;->B:I

    .line 350
    .line 351
    add-int/2addr v3, v7

    .line 352
    iput v3, v0, Ly3/i;->B:I

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_11
    iget v3, v0, Ly3/i;->A:I

    .line 356
    .line 357
    invoke-virtual {v2, v3, v5}, Ly3/h;->c(II)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    iput v3, v0, Ly3/i;->B:I

    .line 362
    .line 363
    :goto_9
    iget v3, v0, Ly3/i;->A:I

    .line 364
    .line 365
    iget v7, v0, Ly3/i;->B:I

    .line 366
    .line 367
    add-int/2addr v3, v7

    .line 368
    iput v3, v0, Ly3/i;->A:I

    .line 369
    .line 370
    const/4 v3, 0x4

    .line 371
    iput v3, v0, Ly3/i;->p:I

    .line 372
    .line 373
    iput v5, v0, Ly3/i;->C:I

    .line 374
    .line 375
    :cond_12
    iget-object v3, v2, Ly3/h;->d:Ly3/r;

    .line 376
    .line 377
    iget-boolean v7, v2, Ly3/h;->l:Z

    .line 378
    .line 379
    if-nez v7, :cond_13

    .line 380
    .line 381
    iget-object v7, v3, Ly3/r;->f:[J

    .line 382
    .line 383
    iget v8, v2, Ly3/h;->f:I

    .line 384
    .line 385
    aget-wide v8, v7, v8

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_13
    iget v7, v2, Ly3/h;->f:I

    .line 389
    .line 390
    iget-object v8, v6, Ly3/q;->i:[J

    .line 391
    .line 392
    aget-wide v7, v8, v7

    .line 393
    .line 394
    move-wide v8, v7

    .line 395
    :goto_a
    if-eqz v13, :cond_14

    .line 396
    .line 397
    invoke-virtual {v13, v8, v9}, Ll4/x;->a(J)J

    .line 398
    .line 399
    .line 400
    move-result-wide v8

    .line 401
    :cond_14
    iget-object v3, v3, Ly3/r;->a:Ly3/o;

    .line 402
    .line 403
    iget v7, v3, Ly3/o;->j:I

    .line 404
    .line 405
    iget-object v11, v2, Ly3/h;->a:Lq3/u;

    .line 406
    .line 407
    if-eqz v7, :cond_1d

    .line 408
    .line 409
    iget-object v14, v0, Ly3/i;->f:LA4/r;

    .line 410
    .line 411
    iget-object v15, v14, LA4/r;->c:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v15, [B

    .line 414
    .line 415
    aput-byte v5, v15, v5

    .line 416
    .line 417
    const/16 v20, 0x1

    .line 418
    .line 419
    aput-byte v5, v15, v20

    .line 420
    .line 421
    aput-byte v5, v15, p2

    .line 422
    .line 423
    add-int/lit8 v10, v7, 0x1

    .line 424
    .line 425
    const/16 v18, 0x4

    .line 426
    .line 427
    rsub-int/lit8 v7, v7, 0x4

    .line 428
    .line 429
    :goto_b
    iget v4, v0, Ly3/i;->B:I

    .line 430
    .line 431
    iget v5, v0, Ly3/i;->A:I

    .line 432
    .line 433
    if-ge v4, v5, :cond_1c

    .line 434
    .line 435
    iget v4, v0, Ly3/i;->C:I

    .line 436
    .line 437
    const-string v5, "video/hevc"

    .line 438
    .line 439
    move-object/from16 v30, v12

    .line 440
    .line 441
    iget-object v12, v3, Ly3/o;->f:Lj3/M;

    .line 442
    .line 443
    if-nez v4, :cond_1a

    .line 444
    .line 445
    move-object v4, v1

    .line 446
    check-cast v4, Lq3/g;

    .line 447
    .line 448
    move-object/from16 v19, v3

    .line 449
    .line 450
    const/4 v3, 0x0

    .line 451
    invoke-virtual {v4, v15, v7, v10, v3}, Lq3/g;->e([BIIZ)Z

    .line 452
    .line 453
    .line 454
    invoke-virtual {v14, v3}, LA4/r;->H(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v14}, LA4/r;->i()I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    const/4 v3, 0x1

    .line 462
    if-lt v4, v3, :cond_19

    .line 463
    .line 464
    add-int/lit8 v4, v4, -0x1

    .line 465
    .line 466
    iput v4, v0, Ly3/i;->C:I

    .line 467
    .line 468
    iget-object v4, v0, Ly3/i;->e:LA4/r;

    .line 469
    .line 470
    const/4 v3, 0x0

    .line 471
    invoke-virtual {v4, v3}, LA4/r;->H(I)V

    .line 472
    .line 473
    .line 474
    const/4 v3, 0x4

    .line 475
    invoke-interface {v11, v3, v4}, Lq3/u;->c(ILA4/r;)V

    .line 476
    .line 477
    .line 478
    const/4 v4, 0x1

    .line 479
    invoke-interface {v11, v4, v14}, Lq3/u;->c(ILA4/r;)V

    .line 480
    .line 481
    .line 482
    iget-object v4, v0, Ly3/i;->G:[Lq3/u;

    .line 483
    .line 484
    array-length v4, v4

    .line 485
    if-lez v4, :cond_17

    .line 486
    .line 487
    iget-object v4, v12, Lj3/M;->l:Ljava/lang/String;

    .line 488
    .line 489
    aget-byte v12, v15, v3

    .line 490
    .line 491
    const-string v3, "video/avc"

    .line 492
    .line 493
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-eqz v3, :cond_15

    .line 498
    .line 499
    and-int/lit8 v3, v12, 0x1f

    .line 500
    .line 501
    move/from16 p2, v7

    .line 502
    .line 503
    const/4 v7, 0x6

    .line 504
    if-eq v3, v7, :cond_16

    .line 505
    .line 506
    goto :goto_c

    .line 507
    :cond_15
    move/from16 p2, v7

    .line 508
    .line 509
    const/4 v7, 0x6

    .line 510
    :goto_c
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    if-eqz v3, :cond_18

    .line 515
    .line 516
    and-int/lit8 v3, v12, 0x7e

    .line 517
    .line 518
    const/16 v20, 0x1

    .line 519
    .line 520
    shr-int/lit8 v3, v3, 0x1

    .line 521
    .line 522
    const/16 v4, 0x27

    .line 523
    .line 524
    if-ne v3, v4, :cond_18

    .line 525
    .line 526
    :cond_16
    const/4 v3, 0x1

    .line 527
    goto :goto_d

    .line 528
    :cond_17
    move/from16 p2, v7

    .line 529
    .line 530
    const/4 v7, 0x6

    .line 531
    :cond_18
    const/4 v3, 0x0

    .line 532
    :goto_d
    iput-boolean v3, v0, Ly3/i;->D:Z

    .line 533
    .line 534
    iget v3, v0, Ly3/i;->B:I

    .line 535
    .line 536
    add-int/lit8 v3, v3, 0x5

    .line 537
    .line 538
    iput v3, v0, Ly3/i;->B:I

    .line 539
    .line 540
    iget v3, v0, Ly3/i;->A:I

    .line 541
    .line 542
    add-int v3, v3, p2

    .line 543
    .line 544
    iput v3, v0, Ly3/i;->A:I

    .line 545
    .line 546
    move/from16 v7, p2

    .line 547
    .line 548
    move-object/from16 v3, v19

    .line 549
    .line 550
    :goto_e
    move-object/from16 v12, v30

    .line 551
    .line 552
    const/4 v5, 0x0

    .line 553
    goto :goto_b

    .line 554
    :cond_19
    const-string v1, "Invalid NAL length"

    .line 555
    .line 556
    const/4 v2, 0x0

    .line 557
    invoke-static {v1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    throw v1

    .line 562
    :cond_1a
    move-object/from16 v19, v3

    .line 563
    .line 564
    move/from16 p2, v7

    .line 565
    .line 566
    const/4 v7, 0x6

    .line 567
    iget-boolean v3, v0, Ly3/i;->D:Z

    .line 568
    .line 569
    if-eqz v3, :cond_1b

    .line 570
    .line 571
    iget-object v3, v0, Ly3/i;->g:LA4/r;

    .line 572
    .line 573
    invoke-virtual {v3, v4}, LA4/r;->E(I)V

    .line 574
    .line 575
    .line 576
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v4, [B

    .line 579
    .line 580
    iget v7, v0, Ly3/i;->C:I

    .line 581
    .line 582
    move/from16 v22, v10

    .line 583
    .line 584
    move-object v10, v1

    .line 585
    check-cast v10, Lq3/g;

    .line 586
    .line 587
    move-object/from16 v23, v14

    .line 588
    .line 589
    const/4 v14, 0x0

    .line 590
    invoke-virtual {v10, v4, v14, v7, v14}, Lq3/g;->e([BIIZ)Z

    .line 591
    .line 592
    .line 593
    iget v4, v0, Ly3/i;->C:I

    .line 594
    .line 595
    invoke-interface {v11, v4, v3}, Lq3/u;->c(ILA4/r;)V

    .line 596
    .line 597
    .line 598
    iget v4, v0, Ly3/i;->C:I

    .line 599
    .line 600
    iget-object v7, v3, LA4/r;->c:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v7, [B

    .line 603
    .line 604
    iget v10, v3, LA4/r;->b:I

    .line 605
    .line 606
    invoke-static {v10, v7}, Ll4/a;->O(I[B)I

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    iget-object v10, v12, Lj3/M;->l:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v5

    .line 616
    invoke-virtual {v3, v5}, LA4/r;->H(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3, v7}, LA4/r;->G(I)V

    .line 620
    .line 621
    .line 622
    iget-object v5, v0, Ly3/i;->G:[Lq3/u;

    .line 623
    .line 624
    invoke-static {v8, v9, v3, v5}, La/a;->e(JLA4/r;[Lq3/u;)V

    .line 625
    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_1b
    move/from16 v22, v10

    .line 629
    .line 630
    move-object/from16 v23, v14

    .line 631
    .line 632
    const/4 v3, 0x0

    .line 633
    invoke-interface {v11, v1, v4, v3}, Lq3/u;->a(Lk4/j;IZ)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    :goto_f
    iget v3, v0, Ly3/i;->B:I

    .line 638
    .line 639
    add-int/2addr v3, v4

    .line 640
    iput v3, v0, Ly3/i;->B:I

    .line 641
    .line 642
    iget v3, v0, Ly3/i;->C:I

    .line 643
    .line 644
    sub-int/2addr v3, v4

    .line 645
    iput v3, v0, Ly3/i;->C:I

    .line 646
    .line 647
    move/from16 v7, p2

    .line 648
    .line 649
    move-object/from16 v3, v19

    .line 650
    .line 651
    move/from16 v10, v22

    .line 652
    .line 653
    move-object/from16 v14, v23

    .line 654
    .line 655
    goto :goto_e

    .line 656
    :cond_1c
    move-object/from16 v30, v12

    .line 657
    .line 658
    goto :goto_11

    .line 659
    :cond_1d
    move-object/from16 v30, v12

    .line 660
    .line 661
    :goto_10
    iget v3, v0, Ly3/i;->B:I

    .line 662
    .line 663
    iget v4, v0, Ly3/i;->A:I

    .line 664
    .line 665
    if-ge v3, v4, :cond_1e

    .line 666
    .line 667
    sub-int/2addr v4, v3

    .line 668
    const/4 v3, 0x0

    .line 669
    invoke-interface {v11, v1, v4, v3}, Lq3/u;->a(Lk4/j;IZ)I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    iget v3, v0, Ly3/i;->B:I

    .line 674
    .line 675
    add-int/2addr v3, v4

    .line 676
    iput v3, v0, Ly3/i;->B:I

    .line 677
    .line 678
    goto :goto_10

    .line 679
    :cond_1e
    :goto_11
    iget-boolean v1, v2, Ly3/h;->l:Z

    .line 680
    .line 681
    if-nez v1, :cond_1f

    .line 682
    .line 683
    iget-object v1, v2, Ly3/h;->d:Ly3/r;

    .line 684
    .line 685
    iget-object v1, v1, Ly3/r;->g:[I

    .line 686
    .line 687
    iget v3, v2, Ly3/h;->f:I

    .line 688
    .line 689
    aget v6, v1, v3

    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_1f
    iget-object v1, v6, Ly3/q;->j:[Z

    .line 693
    .line 694
    iget v3, v2, Ly3/h;->f:I

    .line 695
    .line 696
    aget-boolean v1, v1, v3

    .line 697
    .line 698
    if-eqz v1, :cond_20

    .line 699
    .line 700
    const/4 v6, 0x1

    .line 701
    goto :goto_12

    .line 702
    :cond_20
    const/4 v6, 0x0

    .line 703
    :goto_12
    invoke-virtual {v2}, Ly3/h;->a()Ly3/p;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    if-eqz v1, :cond_21

    .line 708
    .line 709
    const/high16 v1, 0x40000000    # 2.0f

    .line 710
    .line 711
    or-int/2addr v6, v1

    .line 712
    :cond_21
    move/from16 v25, v6

    .line 713
    .line 714
    invoke-virtual {v2}, Ly3/h;->a()Ly3/p;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    if-eqz v1, :cond_22

    .line 719
    .line 720
    iget-object v1, v1, Ly3/p;->c:Lq3/t;

    .line 721
    .line 722
    move-object/from16 v28, v1

    .line 723
    .line 724
    goto :goto_13

    .line 725
    :cond_22
    const/16 v28, 0x0

    .line 726
    .line 727
    :goto_13
    iget v1, v0, Ly3/i;->A:I

    .line 728
    .line 729
    const/16 v27, 0x0

    .line 730
    .line 731
    move/from16 v26, v1

    .line 732
    .line 733
    move-wide/from16 v23, v8

    .line 734
    .line 735
    move-object/from16 v22, v11

    .line 736
    .line 737
    invoke-interface/range {v22 .. v28}, Lq3/u;->d(JIIILq3/t;)V

    .line 738
    .line 739
    .line 740
    :cond_23
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    if-nez v1, :cond_26

    .line 745
    .line 746
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    check-cast v1, Ly3/g;

    .line 751
    .line 752
    iget v3, v0, Ly3/i;->v:I

    .line 753
    .line 754
    iget v4, v1, Ly3/g;->c:I

    .line 755
    .line 756
    sub-int/2addr v3, v4

    .line 757
    iput v3, v0, Ly3/i;->v:I

    .line 758
    .line 759
    iget-boolean v3, v1, Ly3/g;->b:Z

    .line 760
    .line 761
    iget-wide v4, v1, Ly3/g;->a:J

    .line 762
    .line 763
    if-eqz v3, :cond_24

    .line 764
    .line 765
    add-long v4, v4, v23

    .line 766
    .line 767
    :cond_24
    if-eqz v13, :cond_25

    .line 768
    .line 769
    invoke-virtual {v13, v4, v5}, Ll4/x;->a(J)J

    .line 770
    .line 771
    .line 772
    move-result-wide v4

    .line 773
    :cond_25
    move-wide v7, v4

    .line 774
    iget-object v3, v0, Ly3/i;->F:[Lq3/u;

    .line 775
    .line 776
    array-length v4, v3

    .line 777
    const/4 v5, 0x0

    .line 778
    :goto_14
    if-ge v5, v4, :cond_23

    .line 779
    .line 780
    aget-object v6, v3, v5

    .line 781
    .line 782
    iget v11, v0, Ly3/i;->v:I

    .line 783
    .line 784
    const/4 v12, 0x0

    .line 785
    const/4 v9, 0x1

    .line 786
    iget v10, v1, Ly3/g;->c:I

    .line 787
    .line 788
    invoke-interface/range {v6 .. v12}, Lq3/u;->d(JIIILq3/t;)V

    .line 789
    .line 790
    .line 791
    add-int/lit8 v5, v5, 0x1

    .line 792
    .line 793
    goto :goto_14

    .line 794
    :cond_26
    invoke-virtual {v2}, Ly3/h;->b()Z

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    if-nez v1, :cond_27

    .line 799
    .line 800
    const/4 v2, 0x0

    .line 801
    iput-object v2, v0, Ly3/i;->z:Ly3/h;

    .line 802
    .line 803
    :cond_27
    const/4 v7, 0x3

    .line 804
    iput v7, v0, Ly3/i;->p:I

    .line 805
    .line 806
    const/16 v29, 0x0

    .line 807
    .line 808
    return v29

    .line 809
    :cond_28
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    const/4 v3, 0x0

    .line 814
    const/4 v5, 0x0

    .line 815
    :goto_15
    if-ge v5, v2, :cond_2a

    .line 816
    .line 817
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    check-cast v6, Ly3/h;

    .line 822
    .line 823
    iget-object v6, v6, Ly3/h;->b:Ly3/q;

    .line 824
    .line 825
    iget-boolean v9, v6, Ly3/q;->o:Z

    .line 826
    .line 827
    if-eqz v9, :cond_29

    .line 828
    .line 829
    iget-wide v9, v6, Ly3/q;->c:J

    .line 830
    .line 831
    cmp-long v6, v9, v7

    .line 832
    .line 833
    if-gez v6, :cond_29

    .line 834
    .line 835
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    check-cast v3, Ly3/h;

    .line 840
    .line 841
    move-wide v7, v9

    .line 842
    :cond_29
    add-int/lit8 v5, v5, 0x1

    .line 843
    .line 844
    goto :goto_15

    .line 845
    :cond_2a
    if-nez v3, :cond_2b

    .line 846
    .line 847
    const/4 v2, 0x3

    .line 848
    iput v2, v0, Ly3/i;->p:I

    .line 849
    .line 850
    goto/16 :goto_1

    .line 851
    .line 852
    :cond_2b
    move-object v2, v1

    .line 853
    check-cast v2, Lq3/g;

    .line 854
    .line 855
    iget-wide v4, v2, Lq3/g;->d:J

    .line 856
    .line 857
    sub-long/2addr v7, v4

    .line 858
    long-to-int v2, v7

    .line 859
    if-ltz v2, :cond_2c

    .line 860
    .line 861
    move-object v4, v1

    .line 862
    check-cast v4, Lq3/g;

    .line 863
    .line 864
    invoke-virtual {v4, v2}, Lq3/g;->n(I)V

    .line 865
    .line 866
    .line 867
    iget-object v2, v3, Ly3/h;->b:Ly3/q;

    .line 868
    .line 869
    iget-object v3, v2, Ly3/q;->n:LA4/r;

    .line 870
    .line 871
    iget-object v5, v3, LA4/r;->c:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v5, [B

    .line 874
    .line 875
    iget v6, v3, LA4/r;->b:I

    .line 876
    .line 877
    const/4 v14, 0x0

    .line 878
    invoke-virtual {v4, v5, v14, v6, v14}, Lq3/g;->e([BIIZ)Z

    .line 879
    .line 880
    .line 881
    invoke-virtual {v3, v14}, LA4/r;->H(I)V

    .line 882
    .line 883
    .line 884
    iput-boolean v14, v2, Ly3/q;->o:Z

    .line 885
    .line 886
    goto/16 :goto_1

    .line 887
    .line 888
    :cond_2c
    const-string v1, "Offset to encryption data was negative."

    .line 889
    .line 890
    const/4 v2, 0x0

    .line 891
    invoke-static {v1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    throw v1

    .line 896
    :cond_2d
    move/from16 p2, v11

    .line 897
    .line 898
    move-object/from16 v30, v12

    .line 899
    .line 900
    iget-wide v4, v0, Ly3/i;->r:J

    .line 901
    .line 902
    long-to-int v2, v4

    .line 903
    iget v4, v0, Ly3/i;->s:I

    .line 904
    .line 905
    sub-int/2addr v2, v4

    .line 906
    iget-object v4, v0, Ly3/i;->t:LA4/r;

    .line 907
    .line 908
    if-eqz v4, :cond_3b

    .line 909
    .line 910
    iget-object v5, v4, LA4/r;->c:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v5, [B

    .line 913
    .line 914
    move-object v6, v1

    .line 915
    check-cast v6, Lq3/g;

    .line 916
    .line 917
    const/16 v9, 0x8

    .line 918
    .line 919
    const/4 v14, 0x0

    .line 920
    invoke-virtual {v6, v5, v9, v2, v14}, Lq3/g;->e([BIIZ)Z

    .line 921
    .line 922
    .line 923
    new-instance v2, Ly3/b;

    .line 924
    .line 925
    iget v5, v0, Ly3/i;->q:I

    .line 926
    .line 927
    invoke-direct {v2, v5, v4}, Ly3/b;-><init>(ILA4/r;)V

    .line 928
    .line 929
    .line 930
    move-object v6, v1

    .line 931
    check-cast v6, Lq3/g;

    .line 932
    .line 933
    iget-wide v9, v6, Lq3/g;->d:J

    .line 934
    .line 935
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 936
    .line 937
    .line 938
    move-result v6

    .line 939
    if-nez v6, :cond_2e

    .line 940
    .line 941
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    check-cast v3, Ly3/a;

    .line 946
    .line 947
    iget-object v3, v3, Ly3/a;->d:Ljava/util/ArrayList;

    .line 948
    .line 949
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    goto/16 :goto_1e

    .line 953
    .line 954
    :cond_2e
    if-ne v5, v8, :cond_32

    .line 955
    .line 956
    const/16 v2, 0x8

    .line 957
    .line 958
    invoke-virtual {v4, v2}, LA4/r;->H(I)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v4}, LA4/r;->i()I

    .line 962
    .line 963
    .line 964
    move-result v2

    .line 965
    invoke-static {v2}, LQ0/b;->q(I)I

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    const/4 v3, 0x4

    .line 970
    invoke-virtual {v4, v3}, LA4/r;->I(I)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v4}, LA4/r;->y()J

    .line 974
    .line 975
    .line 976
    move-result-wide v25

    .line 977
    if-nez v2, :cond_2f

    .line 978
    .line 979
    invoke-virtual {v4}, LA4/r;->y()J

    .line 980
    .line 981
    .line 982
    move-result-wide v2

    .line 983
    invoke-virtual {v4}, LA4/r;->y()J

    .line 984
    .line 985
    .line 986
    move-result-wide v5

    .line 987
    :goto_16
    add-long/2addr v5, v9

    .line 988
    move-wide/from16 v21, v2

    .line 989
    .line 990
    goto :goto_17

    .line 991
    :cond_2f
    invoke-virtual {v4}, LA4/r;->B()J

    .line 992
    .line 993
    .line 994
    move-result-wide v2

    .line 995
    invoke-virtual {v4}, LA4/r;->B()J

    .line 996
    .line 997
    .line 998
    move-result-wide v5

    .line 999
    goto :goto_16

    .line 1000
    :goto_17
    const-wide/32 v23, 0xf4240

    .line 1001
    .line 1002
    .line 1003
    invoke-static/range {v21 .. v26}, Ll4/y;->O(JJJ)J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v2

    .line 1007
    move/from16 v7, p2

    .line 1008
    .line 1009
    invoke-virtual {v4, v7}, LA4/r;->I(I)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v4}, LA4/r;->C()I

    .line 1013
    .line 1014
    .line 1015
    move-result v7

    .line 1016
    new-array v8, v7, [I

    .line 1017
    .line 1018
    new-array v9, v7, [J

    .line 1019
    .line 1020
    new-array v10, v7, [J

    .line 1021
    .line 1022
    new-array v11, v7, [J

    .line 1023
    .line 1024
    move-wide v14, v2

    .line 1025
    move-wide v12, v5

    .line 1026
    const/4 v5, 0x0

    .line 1027
    :goto_18
    if-ge v5, v7, :cond_31

    .line 1028
    .line 1029
    invoke-virtual {v4}, LA4/r;->i()I

    .line 1030
    .line 1031
    .line 1032
    move-result v6

    .line 1033
    const/high16 v17, -0x80000000

    .line 1034
    .line 1035
    and-int v17, v6, v17

    .line 1036
    .line 1037
    if-nez v17, :cond_30

    .line 1038
    .line 1039
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v23

    .line 1043
    const v17, 0x7fffffff

    .line 1044
    .line 1045
    .line 1046
    and-int v6, v6, v17

    .line 1047
    .line 1048
    aput v6, v8, v5

    .line 1049
    .line 1050
    aput-wide v12, v9, v5

    .line 1051
    .line 1052
    aput-wide v14, v11, v5

    .line 1053
    .line 1054
    add-long v21, v21, v23

    .line 1055
    .line 1056
    const-wide/32 v23, 0xf4240

    .line 1057
    .line 1058
    .line 1059
    invoke-static/range {v21 .. v26}, Ll4/y;->O(JJJ)J

    .line 1060
    .line 1061
    .line 1062
    move-result-wide v14

    .line 1063
    aget-wide v23, v11, v5

    .line 1064
    .line 1065
    sub-long v23, v14, v23

    .line 1066
    .line 1067
    aput-wide v23, v10, v5

    .line 1068
    .line 1069
    const/4 v6, 0x4

    .line 1070
    invoke-virtual {v4, v6}, LA4/r;->I(I)V

    .line 1071
    .line 1072
    .line 1073
    aget v6, v8, v5

    .line 1074
    .line 1075
    move-wide/from16 v23, v2

    .line 1076
    .line 1077
    int-to-long v1, v6

    .line 1078
    add-long/2addr v12, v1

    .line 1079
    add-int/lit8 v5, v5, 0x1

    .line 1080
    .line 1081
    move-object/from16 v1, p1

    .line 1082
    .line 1083
    move-wide/from16 v2, v23

    .line 1084
    .line 1085
    goto :goto_18

    .line 1086
    :cond_30
    const-string v1, "Unhandled indirect reference"

    .line 1087
    .line 1088
    const/4 v2, 0x0

    .line 1089
    invoke-static {v1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    throw v1

    .line 1094
    :cond_31
    move-wide/from16 v23, v2

    .line 1095
    .line 1096
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    new-instance v2, Lq3/f;

    .line 1101
    .line 1102
    invoke-direct {v2, v8, v9, v10, v11}, Lq3/f;-><init>([I[J[J[J)V

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v2, Ljava/lang/Long;

    .line 1112
    .line 1113
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1114
    .line 1115
    .line 1116
    move-result-wide v2

    .line 1117
    iput-wide v2, v0, Ly3/i;->y:J

    .line 1118
    .line 1119
    iget-object v2, v0, Ly3/i;->E:Lq3/l;

    .line 1120
    .line 1121
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1122
    .line 1123
    check-cast v1, Lq3/r;

    .line 1124
    .line 1125
    invoke-interface {v2, v1}, Lq3/l;->r(Lq3/r;)V

    .line 1126
    .line 1127
    .line 1128
    const/4 v3, 0x1

    .line 1129
    iput-boolean v3, v0, Ly3/i;->H:Z

    .line 1130
    .line 1131
    goto/16 :goto_1e

    .line 1132
    .line 1133
    :cond_32
    if-ne v5, v7, :cond_3c

    .line 1134
    .line 1135
    iget-object v1, v0, Ly3/i;->F:[Lq3/u;

    .line 1136
    .line 1137
    array-length v1, v1

    .line 1138
    if-nez v1, :cond_33

    .line 1139
    .line 1140
    goto/16 :goto_1e

    .line 1141
    .line 1142
    :cond_33
    const/16 v2, 0x8

    .line 1143
    .line 1144
    invoke-virtual {v4, v2}, LA4/r;->H(I)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v4}, LA4/r;->i()I

    .line 1148
    .line 1149
    .line 1150
    move-result v1

    .line 1151
    invoke-static {v1}, LQ0/b;->q(I)I

    .line 1152
    .line 1153
    .line 1154
    move-result v1

    .line 1155
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    if-eqz v1, :cond_35

    .line 1161
    .line 1162
    const/4 v8, 0x1

    .line 1163
    if-eq v1, v8, :cond_34

    .line 1164
    .line 1165
    const-string v2, "Skipping unsupported emsg version: "

    .line 1166
    .line 1167
    invoke-static {v2, v1, v15}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    goto/16 :goto_1e

    .line 1171
    .line 1172
    :cond_34
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v9

    .line 1176
    invoke-virtual {v4}, LA4/r;->B()J

    .line 1177
    .line 1178
    .line 1179
    move-result-wide v5

    .line 1180
    const-wide/32 v7, 0xf4240

    .line 1181
    .line 1182
    .line 1183
    invoke-static/range {v5 .. v10}, Ll4/y;->O(JJJ)J

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v11

    .line 1187
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v5

    .line 1191
    const-wide/16 v7, 0x3e8

    .line 1192
    .line 1193
    invoke-static/range {v5 .. v10}, Ll4/y;->O(JJJ)J

    .line 1194
    .line 1195
    .line 1196
    move-result-wide v5

    .line 1197
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v7

    .line 1201
    invoke-virtual {v4}, LA4/r;->r()Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v1

    .line 1205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v4}, LA4/r;->r()Ljava/lang/String;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v9

    .line 1212
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    move-wide/from16 v24, v5

    .line 1216
    .line 1217
    move-wide/from16 v26, v7

    .line 1218
    .line 1219
    move-wide v5, v2

    .line 1220
    :goto_19
    move-object/from16 v22, v1

    .line 1221
    .line 1222
    move-object/from16 v23, v9

    .line 1223
    .line 1224
    goto :goto_1b

    .line 1225
    :cond_35
    invoke-virtual {v4}, LA4/r;->r()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v4}, LA4/r;->r()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v9

    .line 1236
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1240
    .line 1241
    .line 1242
    move-result-wide v18

    .line 1243
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1244
    .line 1245
    .line 1246
    move-result-wide v14

    .line 1247
    const-wide/32 v16, 0xf4240

    .line 1248
    .line 1249
    .line 1250
    invoke-static/range {v14 .. v19}, Ll4/y;->O(JJJ)J

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v5

    .line 1254
    iget-wide v7, v0, Ly3/i;->y:J

    .line 1255
    .line 1256
    cmp-long v10, v7, v2

    .line 1257
    .line 1258
    if-eqz v10, :cond_36

    .line 1259
    .line 1260
    add-long/2addr v7, v5

    .line 1261
    move-wide v11, v7

    .line 1262
    goto :goto_1a

    .line 1263
    :cond_36
    move-wide v11, v2

    .line 1264
    :goto_1a
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1265
    .line 1266
    .line 1267
    move-result-wide v14

    .line 1268
    const-wide/16 v16, 0x3e8

    .line 1269
    .line 1270
    invoke-static/range {v14 .. v19}, Ll4/y;->O(JJJ)J

    .line 1271
    .line 1272
    .line 1273
    move-result-wide v7

    .line 1274
    invoke-virtual {v4}, LA4/r;->y()J

    .line 1275
    .line 1276
    .line 1277
    move-result-wide v14

    .line 1278
    move-wide/from16 v24, v7

    .line 1279
    .line 1280
    move-wide/from16 v26, v14

    .line 1281
    .line 1282
    goto :goto_19

    .line 1283
    :goto_1b
    invoke-virtual {v4}, LA4/r;->e()I

    .line 1284
    .line 1285
    .line 1286
    move-result v1

    .line 1287
    new-array v1, v1, [B

    .line 1288
    .line 1289
    invoke-virtual {v4}, LA4/r;->e()I

    .line 1290
    .line 1291
    .line 1292
    move-result v7

    .line 1293
    const/4 v14, 0x0

    .line 1294
    invoke-virtual {v4, v1, v14, v7}, LA4/r;->h([BII)V

    .line 1295
    .line 1296
    .line 1297
    new-instance v21, LF3/a;

    .line 1298
    .line 1299
    move-object/from16 v28, v1

    .line 1300
    .line 1301
    invoke-direct/range {v21 .. v28}, LF3/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 1302
    .line 1303
    .line 1304
    move-object/from16 v1, v21

    .line 1305
    .line 1306
    new-instance v4, LA4/r;

    .line 1307
    .line 1308
    iget-object v7, v0, Ly3/i;->k:LA1/g;

    .line 1309
    .line 1310
    invoke-virtual {v7, v1}, LA1/g;->q(LF3/a;)[B

    .line 1311
    .line 1312
    .line 1313
    move-result-object v1

    .line 1314
    invoke-direct {v4, v1}, LA4/r;-><init>([B)V

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v4}, LA4/r;->e()I

    .line 1318
    .line 1319
    .line 1320
    move-result v1

    .line 1321
    iget-object v7, v0, Ly3/i;->F:[Lq3/u;

    .line 1322
    .line 1323
    array-length v8, v7

    .line 1324
    const/4 v9, 0x0

    .line 1325
    :goto_1c
    if-ge v9, v8, :cond_37

    .line 1326
    .line 1327
    aget-object v10, v7, v9

    .line 1328
    .line 1329
    const/4 v14, 0x0

    .line 1330
    invoke-virtual {v4, v14}, LA4/r;->H(I)V

    .line 1331
    .line 1332
    .line 1333
    invoke-interface {v10, v1, v4}, Lq3/u;->c(ILA4/r;)V

    .line 1334
    .line 1335
    .line 1336
    add-int/lit8 v9, v9, 0x1

    .line 1337
    .line 1338
    goto :goto_1c

    .line 1339
    :cond_37
    cmp-long v2, v11, v2

    .line 1340
    .line 1341
    if-nez v2, :cond_38

    .line 1342
    .line 1343
    new-instance v2, Ly3/g;

    .line 1344
    .line 1345
    const/4 v3, 0x1

    .line 1346
    invoke-direct {v2, v1, v5, v6, v3}, Ly3/g;-><init>(IJZ)V

    .line 1347
    .line 1348
    .line 1349
    move-object/from16 v3, v30

    .line 1350
    .line 1351
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1352
    .line 1353
    .line 1354
    iget v2, v0, Ly3/i;->v:I

    .line 1355
    .line 1356
    add-int/2addr v2, v1

    .line 1357
    iput v2, v0, Ly3/i;->v:I

    .line 1358
    .line 1359
    goto :goto_1e

    .line 1360
    :cond_38
    move-object/from16 v3, v30

    .line 1361
    .line 1362
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1363
    .line 1364
    .line 1365
    move-result v2

    .line 1366
    if-nez v2, :cond_39

    .line 1367
    .line 1368
    new-instance v2, Ly3/g;

    .line 1369
    .line 1370
    const/4 v14, 0x0

    .line 1371
    invoke-direct {v2, v1, v11, v12, v14}, Ly3/g;-><init>(IJZ)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    iget v2, v0, Ly3/i;->v:I

    .line 1378
    .line 1379
    add-int/2addr v2, v1

    .line 1380
    iput v2, v0, Ly3/i;->v:I

    .line 1381
    .line 1382
    goto :goto_1e

    .line 1383
    :cond_39
    if-eqz v13, :cond_3a

    .line 1384
    .line 1385
    invoke-virtual {v13, v11, v12}, Ll4/x;->a(J)J

    .line 1386
    .line 1387
    .line 1388
    move-result-wide v11

    .line 1389
    :cond_3a
    move-wide/from16 v22, v11

    .line 1390
    .line 1391
    iget-object v2, v0, Ly3/i;->F:[Lq3/u;

    .line 1392
    .line 1393
    array-length v3, v2

    .line 1394
    const/4 v5, 0x0

    .line 1395
    :goto_1d
    if-ge v5, v3, :cond_3c

    .line 1396
    .line 1397
    aget-object v21, v2, v5

    .line 1398
    .line 1399
    const/16 v27, 0x0

    .line 1400
    .line 1401
    const/16 v24, 0x1

    .line 1402
    .line 1403
    const/16 v26, 0x0

    .line 1404
    .line 1405
    move/from16 v25, v1

    .line 1406
    .line 1407
    invoke-interface/range {v21 .. v27}, Lq3/u;->d(JIIILq3/t;)V

    .line 1408
    .line 1409
    .line 1410
    add-int/lit8 v5, v5, 0x1

    .line 1411
    .line 1412
    goto :goto_1d

    .line 1413
    :cond_3b
    move-object/from16 v1, p1

    .line 1414
    .line 1415
    check-cast v1, Lq3/g;

    .line 1416
    .line 1417
    invoke-virtual {v1, v2}, Lq3/g;->n(I)V

    .line 1418
    .line 1419
    .line 1420
    :cond_3c
    :goto_1e
    move-object/from16 v1, p1

    .line 1421
    .line 1422
    check-cast v1, Lq3/g;

    .line 1423
    .line 1424
    iget-wide v1, v1, Lq3/g;->d:J

    .line 1425
    .line 1426
    invoke-virtual {v0, v1, v2}, Ly3/i;->e(J)V

    .line 1427
    .line 1428
    .line 1429
    goto/16 :goto_0

    .line 1430
    .line 1431
    :cond_3d
    iget v1, v0, Ly3/i;->s:I

    .line 1432
    .line 1433
    iget-object v2, v0, Ly3/i;->l:LA4/r;

    .line 1434
    .line 1435
    if-nez v1, :cond_3f

    .line 1436
    .line 1437
    iget-object v1, v2, LA4/r;->c:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v1, [B

    .line 1440
    .line 1441
    move-object/from16 v5, p1

    .line 1442
    .line 1443
    check-cast v5, Lq3/g;

    .line 1444
    .line 1445
    const/4 v6, 0x1

    .line 1446
    const/16 v9, 0x8

    .line 1447
    .line 1448
    const/4 v14, 0x0

    .line 1449
    invoke-virtual {v5, v1, v14, v9, v6}, Lq3/g;->e([BIIZ)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v1

    .line 1453
    if-nez v1, :cond_3e

    .line 1454
    .line 1455
    const/4 v1, -0x1

    .line 1456
    return v1

    .line 1457
    :cond_3e
    iput v9, v0, Ly3/i;->s:I

    .line 1458
    .line 1459
    invoke-virtual {v2, v14}, LA4/r;->H(I)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v2}, LA4/r;->y()J

    .line 1463
    .line 1464
    .line 1465
    move-result-wide v5

    .line 1466
    iput-wide v5, v0, Ly3/i;->r:J

    .line 1467
    .line 1468
    invoke-virtual {v2}, LA4/r;->i()I

    .line 1469
    .line 1470
    .line 1471
    move-result v1

    .line 1472
    iput v1, v0, Ly3/i;->q:I

    .line 1473
    .line 1474
    :cond_3f
    iget-wide v5, v0, Ly3/i;->r:J

    .line 1475
    .line 1476
    const-wide/16 v9, 0x1

    .line 1477
    .line 1478
    cmp-long v1, v5, v9

    .line 1479
    .line 1480
    if-nez v1, :cond_40

    .line 1481
    .line 1482
    iget-object v1, v2, LA4/r;->c:Ljava/lang/Object;

    .line 1483
    .line 1484
    check-cast v1, [B

    .line 1485
    .line 1486
    move-object/from16 v5, p1

    .line 1487
    .line 1488
    check-cast v5, Lq3/g;

    .line 1489
    .line 1490
    const/16 v9, 0x8

    .line 1491
    .line 1492
    const/4 v14, 0x0

    .line 1493
    invoke-virtual {v5, v1, v9, v9, v14}, Lq3/g;->e([BIIZ)Z

    .line 1494
    .line 1495
    .line 1496
    iget v1, v0, Ly3/i;->s:I

    .line 1497
    .line 1498
    add-int/2addr v1, v9

    .line 1499
    iput v1, v0, Ly3/i;->s:I

    .line 1500
    .line 1501
    invoke-virtual {v2}, LA4/r;->B()J

    .line 1502
    .line 1503
    .line 1504
    move-result-wide v5

    .line 1505
    iput-wide v5, v0, Ly3/i;->r:J

    .line 1506
    .line 1507
    goto :goto_1f

    .line 1508
    :cond_40
    const-wide/16 v9, 0x0

    .line 1509
    .line 1510
    cmp-long v1, v5, v9

    .line 1511
    .line 1512
    if-nez v1, :cond_42

    .line 1513
    .line 1514
    move-object/from16 v1, p1

    .line 1515
    .line 1516
    check-cast v1, Lq3/g;

    .line 1517
    .line 1518
    iget-wide v5, v1, Lq3/g;->c:J

    .line 1519
    .line 1520
    const-wide/16 v9, -0x1

    .line 1521
    .line 1522
    cmp-long v1, v5, v9

    .line 1523
    .line 1524
    if-nez v1, :cond_41

    .line 1525
    .line 1526
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v1

    .line 1530
    if-nez v1, :cond_41

    .line 1531
    .line 1532
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v1

    .line 1536
    check-cast v1, Ly3/a;

    .line 1537
    .line 1538
    iget-wide v5, v1, Ly3/a;->c:J

    .line 1539
    .line 1540
    :cond_41
    cmp-long v1, v5, v9

    .line 1541
    .line 1542
    if-eqz v1, :cond_42

    .line 1543
    .line 1544
    move-object/from16 v1, p1

    .line 1545
    .line 1546
    check-cast v1, Lq3/g;

    .line 1547
    .line 1548
    iget-wide v9, v1, Lq3/g;->d:J

    .line 1549
    .line 1550
    sub-long/2addr v5, v9

    .line 1551
    iget v1, v0, Ly3/i;->s:I

    .line 1552
    .line 1553
    int-to-long v9, v1

    .line 1554
    add-long/2addr v5, v9

    .line 1555
    iput-wide v5, v0, Ly3/i;->r:J

    .line 1556
    .line 1557
    :cond_42
    :goto_1f
    iget-wide v5, v0, Ly3/i;->r:J

    .line 1558
    .line 1559
    iget v1, v0, Ly3/i;->s:I

    .line 1560
    .line 1561
    int-to-long v9, v1

    .line 1562
    cmp-long v5, v5, v9

    .line 1563
    .line 1564
    if-ltz v5, :cond_4f

    .line 1565
    .line 1566
    move-object/from16 v5, p1

    .line 1567
    .line 1568
    check-cast v5, Lq3/g;

    .line 1569
    .line 1570
    iget-wide v5, v5, Lq3/g;->d:J

    .line 1571
    .line 1572
    int-to-long v9, v1

    .line 1573
    sub-long/2addr v5, v9

    .line 1574
    iget v1, v0, Ly3/i;->q:I

    .line 1575
    .line 1576
    const v9, 0x6d646174

    .line 1577
    .line 1578
    .line 1579
    const v10, 0x6d6f6f66

    .line 1580
    .line 1581
    .line 1582
    if-eq v1, v10, :cond_43

    .line 1583
    .line 1584
    if-ne v1, v9, :cond_44

    .line 1585
    .line 1586
    :cond_43
    iget-boolean v1, v0, Ly3/i;->H:Z

    .line 1587
    .line 1588
    if-nez v1, :cond_44

    .line 1589
    .line 1590
    iget-object v1, v0, Ly3/i;->E:Lq3/l;

    .line 1591
    .line 1592
    new-instance v11, Lq3/m;

    .line 1593
    .line 1594
    iget-wide v12, v0, Ly3/i;->x:J

    .line 1595
    .line 1596
    invoke-direct {v11, v12, v13, v5, v6}, Lq3/m;-><init>(JJ)V

    .line 1597
    .line 1598
    .line 1599
    invoke-interface {v1, v11}, Lq3/l;->r(Lq3/r;)V

    .line 1600
    .line 1601
    .line 1602
    const/4 v1, 0x1

    .line 1603
    iput-boolean v1, v0, Ly3/i;->H:Z

    .line 1604
    .line 1605
    :cond_44
    iget v1, v0, Ly3/i;->q:I

    .line 1606
    .line 1607
    if-ne v1, v10, :cond_45

    .line 1608
    .line 1609
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 1610
    .line 1611
    .line 1612
    move-result v1

    .line 1613
    const/4 v11, 0x0

    .line 1614
    :goto_20
    if-ge v11, v1, :cond_45

    .line 1615
    .line 1616
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v12

    .line 1620
    check-cast v12, Ly3/h;

    .line 1621
    .line 1622
    iget-object v12, v12, Ly3/h;->b:Ly3/q;

    .line 1623
    .line 1624
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    iput-wide v5, v12, Ly3/q;->c:J

    .line 1628
    .line 1629
    iput-wide v5, v12, Ly3/q;->b:J

    .line 1630
    .line 1631
    add-int/lit8 v11, v11, 0x1

    .line 1632
    .line 1633
    goto :goto_20

    .line 1634
    :cond_45
    iget v1, v0, Ly3/i;->q:I

    .line 1635
    .line 1636
    if-ne v1, v9, :cond_46

    .line 1637
    .line 1638
    const/4 v4, 0x0

    .line 1639
    iput-object v4, v0, Ly3/i;->z:Ly3/h;

    .line 1640
    .line 1641
    iget-wide v1, v0, Ly3/i;->r:J

    .line 1642
    .line 1643
    add-long/2addr v5, v1

    .line 1644
    iput-wide v5, v0, Ly3/i;->u:J

    .line 1645
    .line 1646
    const/4 v7, 0x2

    .line 1647
    iput v7, v0, Ly3/i;->p:I

    .line 1648
    .line 1649
    goto/16 :goto_0

    .line 1650
    .line 1651
    :cond_46
    const v4, 0x6d6f6f76

    .line 1652
    .line 1653
    .line 1654
    if-eq v1, v4, :cond_4d

    .line 1655
    .line 1656
    const v4, 0x7472616b

    .line 1657
    .line 1658
    .line 1659
    if-eq v1, v4, :cond_4d

    .line 1660
    .line 1661
    const v4, 0x6d646961

    .line 1662
    .line 1663
    .line 1664
    if-eq v1, v4, :cond_4d

    .line 1665
    .line 1666
    const v4, 0x6d696e66

    .line 1667
    .line 1668
    .line 1669
    if-eq v1, v4, :cond_4d

    .line 1670
    .line 1671
    const v4, 0x7374626c

    .line 1672
    .line 1673
    .line 1674
    if-eq v1, v4, :cond_4d

    .line 1675
    .line 1676
    if-eq v1, v10, :cond_4d

    .line 1677
    .line 1678
    const v4, 0x74726166

    .line 1679
    .line 1680
    .line 1681
    if-eq v1, v4, :cond_4d

    .line 1682
    .line 1683
    const v4, 0x6d766578

    .line 1684
    .line 1685
    .line 1686
    if-eq v1, v4, :cond_4d

    .line 1687
    .line 1688
    const v4, 0x65647473

    .line 1689
    .line 1690
    .line 1691
    if-ne v1, v4, :cond_47

    .line 1692
    .line 1693
    goto/16 :goto_22

    .line 1694
    .line 1695
    :cond_47
    const v3, 0x68646c72    # 4.3148E24f

    .line 1696
    .line 1697
    .line 1698
    const-wide/32 v4, 0x7fffffff

    .line 1699
    .line 1700
    .line 1701
    if-eq v1, v3, :cond_4a

    .line 1702
    .line 1703
    const v3, 0x6d646864

    .line 1704
    .line 1705
    .line 1706
    if-eq v1, v3, :cond_4a

    .line 1707
    .line 1708
    const v3, 0x6d766864

    .line 1709
    .line 1710
    .line 1711
    if-eq v1, v3, :cond_4a

    .line 1712
    .line 1713
    if-eq v1, v8, :cond_4a

    .line 1714
    .line 1715
    const v3, 0x73747364

    .line 1716
    .line 1717
    .line 1718
    if-eq v1, v3, :cond_4a

    .line 1719
    .line 1720
    const v3, 0x73747473

    .line 1721
    .line 1722
    .line 1723
    if-eq v1, v3, :cond_4a

    .line 1724
    .line 1725
    const v3, 0x63747473

    .line 1726
    .line 1727
    .line 1728
    if-eq v1, v3, :cond_4a

    .line 1729
    .line 1730
    const v3, 0x73747363

    .line 1731
    .line 1732
    .line 1733
    if-eq v1, v3, :cond_4a

    .line 1734
    .line 1735
    const v3, 0x7374737a

    .line 1736
    .line 1737
    .line 1738
    if-eq v1, v3, :cond_4a

    .line 1739
    .line 1740
    const v3, 0x73747a32

    .line 1741
    .line 1742
    .line 1743
    if-eq v1, v3, :cond_4a

    .line 1744
    .line 1745
    const v3, 0x7374636f

    .line 1746
    .line 1747
    .line 1748
    if-eq v1, v3, :cond_4a

    .line 1749
    .line 1750
    const v3, 0x636f3634

    .line 1751
    .line 1752
    .line 1753
    if-eq v1, v3, :cond_4a

    .line 1754
    .line 1755
    const v3, 0x73747373

    .line 1756
    .line 1757
    .line 1758
    if-eq v1, v3, :cond_4a

    .line 1759
    .line 1760
    const v3, 0x74666474

    .line 1761
    .line 1762
    .line 1763
    if-eq v1, v3, :cond_4a

    .line 1764
    .line 1765
    const v3, 0x74666864

    .line 1766
    .line 1767
    .line 1768
    if-eq v1, v3, :cond_4a

    .line 1769
    .line 1770
    const v3, 0x746b6864

    .line 1771
    .line 1772
    .line 1773
    if-eq v1, v3, :cond_4a

    .line 1774
    .line 1775
    const v3, 0x74726578

    .line 1776
    .line 1777
    .line 1778
    if-eq v1, v3, :cond_4a

    .line 1779
    .line 1780
    const v3, 0x7472756e

    .line 1781
    .line 1782
    .line 1783
    if-eq v1, v3, :cond_4a

    .line 1784
    .line 1785
    const v3, 0x70737368    # 3.013775E29f

    .line 1786
    .line 1787
    .line 1788
    if-eq v1, v3, :cond_4a

    .line 1789
    .line 1790
    const v3, 0x7361697a

    .line 1791
    .line 1792
    .line 1793
    if-eq v1, v3, :cond_4a

    .line 1794
    .line 1795
    const v3, 0x7361696f

    .line 1796
    .line 1797
    .line 1798
    if-eq v1, v3, :cond_4a

    .line 1799
    .line 1800
    const v3, 0x73656e63

    .line 1801
    .line 1802
    .line 1803
    if-eq v1, v3, :cond_4a

    .line 1804
    .line 1805
    const v3, 0x75756964

    .line 1806
    .line 1807
    .line 1808
    if-eq v1, v3, :cond_4a

    .line 1809
    .line 1810
    const v3, 0x73626770

    .line 1811
    .line 1812
    .line 1813
    if-eq v1, v3, :cond_4a

    .line 1814
    .line 1815
    const v3, 0x73677064

    .line 1816
    .line 1817
    .line 1818
    if-eq v1, v3, :cond_4a

    .line 1819
    .line 1820
    const v3, 0x656c7374

    .line 1821
    .line 1822
    .line 1823
    if-eq v1, v3, :cond_4a

    .line 1824
    .line 1825
    const v3, 0x6d656864

    .line 1826
    .line 1827
    .line 1828
    if-eq v1, v3, :cond_4a

    .line 1829
    .line 1830
    if-ne v1, v7, :cond_48

    .line 1831
    .line 1832
    goto :goto_21

    .line 1833
    :cond_48
    iget-wide v1, v0, Ly3/i;->r:J

    .line 1834
    .line 1835
    cmp-long v1, v1, v4

    .line 1836
    .line 1837
    if-gtz v1, :cond_49

    .line 1838
    .line 1839
    const/4 v2, 0x0

    .line 1840
    iput-object v2, v0, Ly3/i;->t:LA4/r;

    .line 1841
    .line 1842
    const/4 v3, 0x1

    .line 1843
    iput v3, v0, Ly3/i;->p:I

    .line 1844
    .line 1845
    goto/16 :goto_0

    .line 1846
    .line 1847
    :cond_49
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 1848
    .line 1849
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v1

    .line 1853
    throw v1

    .line 1854
    :cond_4a
    :goto_21
    iget v1, v0, Ly3/i;->s:I

    .line 1855
    .line 1856
    const/16 v9, 0x8

    .line 1857
    .line 1858
    if-ne v1, v9, :cond_4c

    .line 1859
    .line 1860
    iget-wide v6, v0, Ly3/i;->r:J

    .line 1861
    .line 1862
    cmp-long v1, v6, v4

    .line 1863
    .line 1864
    if-gtz v1, :cond_4b

    .line 1865
    .line 1866
    new-instance v1, LA4/r;

    .line 1867
    .line 1868
    long-to-int v3, v6

    .line 1869
    invoke-direct {v1, v3}, LA4/r;-><init>(I)V

    .line 1870
    .line 1871
    .line 1872
    iget-object v2, v2, LA4/r;->c:Ljava/lang/Object;

    .line 1873
    .line 1874
    check-cast v2, [B

    .line 1875
    .line 1876
    iget-object v3, v1, LA4/r;->c:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v3, [B

    .line 1879
    .line 1880
    const/16 v9, 0x8

    .line 1881
    .line 1882
    const/4 v14, 0x0

    .line 1883
    invoke-static {v2, v14, v3, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1884
    .line 1885
    .line 1886
    iput-object v1, v0, Ly3/i;->t:LA4/r;

    .line 1887
    .line 1888
    const/4 v3, 0x1

    .line 1889
    iput v3, v0, Ly3/i;->p:I

    .line 1890
    .line 1891
    goto/16 :goto_0

    .line 1892
    .line 1893
    :cond_4b
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 1894
    .line 1895
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v1

    .line 1899
    throw v1

    .line 1900
    :cond_4c
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 1901
    .line 1902
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v1

    .line 1906
    throw v1

    .line 1907
    :cond_4d
    :goto_22
    move-object/from16 v2, p1

    .line 1908
    .line 1909
    check-cast v2, Lq3/g;

    .line 1910
    .line 1911
    iget-wide v4, v2, Lq3/g;->d:J

    .line 1912
    .line 1913
    iget-wide v6, v0, Ly3/i;->r:J

    .line 1914
    .line 1915
    add-long/2addr v4, v6

    .line 1916
    const-wide/16 v6, 0x8

    .line 1917
    .line 1918
    sub-long/2addr v4, v6

    .line 1919
    new-instance v2, Ly3/a;

    .line 1920
    .line 1921
    invoke-direct {v2, v4, v5, v1}, Ly3/a;-><init>(JI)V

    .line 1922
    .line 1923
    .line 1924
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1925
    .line 1926
    .line 1927
    iget-wide v1, v0, Ly3/i;->r:J

    .line 1928
    .line 1929
    iget v3, v0, Ly3/i;->s:I

    .line 1930
    .line 1931
    int-to-long v6, v3

    .line 1932
    cmp-long v1, v1, v6

    .line 1933
    .line 1934
    if-nez v1, :cond_4e

    .line 1935
    .line 1936
    invoke-virtual {v0, v4, v5}, Ly3/i;->e(J)V

    .line 1937
    .line 1938
    .line 1939
    goto/16 :goto_0

    .line 1940
    .line 1941
    :cond_4e
    const/4 v14, 0x0

    .line 1942
    iput v14, v0, Ly3/i;->p:I

    .line 1943
    .line 1944
    iput v14, v0, Ly3/i;->s:I

    .line 1945
    .line 1946
    goto/16 :goto_0

    .line 1947
    .line 1948
    :cond_4f
    const-string v1, "Atom size less than header length (unsupported)."

    .line 1949
    .line 1950
    invoke-static {v1}, Lj3/j0;->c(Ljava/lang/String;)Lj3/j0;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v1

    .line 1954
    throw v1
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
    .line 4025
    .line 4026
    .line 4027
    .line 4028
    .line 4029
    .line 4030
    .line 4031
    .line 4032
    .line 4033
    .line 4034
    .line 4035
    .line 4036
    .line 4037
    .line 4038
    .line 4039
    .line 4040
    .line 4041
    .line 4042
    .line 4043
    .line 4044
    .line 4045
    .line 4046
    .line 4047
    .line 4048
    .line 4049
    .line 4050
    .line 4051
    .line 4052
    .line 4053
    .line 4054
    .line 4055
    .line 4056
    .line 4057
    .line 4058
    .line 4059
    .line 4060
    .line 4061
    .line 4062
    .line 4063
    .line 4064
    .line 4065
    .line 4066
    .line 4067
    .line 4068
    .line 4069
    .line 4070
    .line 4071
    .line 4072
    .line 4073
    .line 4074
    .line 4075
    .line 4076
    .line 4077
    .line 4078
    .line 4079
    .line 4080
    .line 4081
    .line 4082
    .line 4083
    .line 4084
    .line 4085
    .line 4086
    .line 4087
    .line 4088
    .line 4089
    .line 4090
    .line 4091
    .line 4092
    .line 4093
    .line 4094
    .line 4095
    .line 4096
    .line 4097
    .line 4098
    .line 4099
    .line 4100
    .line 4101
    .line 4102
    .line 4103
    .line 4104
    .line 4105
    .line 4106
    .line 4107
    .line 4108
    .line 4109
    .line 4110
    .line 4111
    .line 4112
    .line 4113
    .line 4114
    .line 4115
    .line 4116
    .line 4117
    .line 4118
    .line 4119
    .line 4120
    .line 4121
    .line 4122
    .line 4123
    .line 4124
    .line 4125
    .line 4126
    .line 4127
    .line 4128
    .line 4129
    .line 4130
    .line 4131
    .line 4132
    .line 4133
    .line 4134
    .line 4135
    .line 4136
    .line 4137
    .line 4138
    .line 4139
    .line 4140
    .line 4141
    .line 4142
    .line 4143
    .line 4144
    .line 4145
    .line 4146
    .line 4147
    .line 4148
    .line 4149
    .line 4150
    .line 4151
    .line 4152
    .line 4153
    .line 4154
    .line 4155
    .line 4156
    .line 4157
    .line 4158
    .line 4159
    .line 4160
    .line 4161
    .line 4162
    .line 4163
    .line 4164
    .line 4165
    .line 4166
    .line 4167
    .line 4168
    .line 4169
    .line 4170
    .line 4171
    .line 4172
    .line 4173
    .line 4174
    .line 4175
    .line 4176
    .line 4177
    .line 4178
    .line 4179
    .line 4180
    .line 4181
    .line 4182
    .line 4183
    .line 4184
    .line 4185
    .line 4186
    .line 4187
    .line 4188
    .line 4189
    .line 4190
    .line 4191
    .line 4192
    .line 4193
    .line 4194
    .line 4195
    .line 4196
    .line 4197
    .line 4198
    .line 4199
    .line 4200
    .line 4201
    .line 4202
    .line 4203
    .line 4204
    .line 4205
    .line 4206
    .line 4207
    .line 4208
    .line 4209
    .line 4210
    .line 4211
    .line 4212
    .line 4213
    .line 4214
    .line 4215
    .line 4216
    .line 4217
    .line 4218
    .line 4219
    .line 4220
    .line 4221
    .line 4222
    .line 4223
    .line 4224
    .line 4225
    .line 4226
    .line 4227
    .line 4228
    .line 4229
    .line 4230
    .line 4231
    .line 4232
    .line 4233
    .line 4234
    .line 4235
    .line 4236
    .line 4237
    .line 4238
    .line 4239
    .line 4240
    .line 4241
    .line 4242
    .line 4243
    .line 4244
    .line 4245
    .line 4246
    .line 4247
    .line 4248
    .line 4249
    .line 4250
    .line 4251
    .line 4252
    .line 4253
    .line 4254
    .line 4255
    .line 4256
    .line 4257
    .line 4258
    .line 4259
    .line 4260
    .line 4261
    .line 4262
    .line 4263
    .line 4264
    .line 4265
    .line 4266
    .line 4267
    .line 4268
    .line 4269
    .line 4270
    .line 4271
    .line 4272
    .line 4273
    .line 4274
    .line 4275
    .line 4276
    .line 4277
    .line 4278
    .line 4279
    .line 4280
    .line 4281
    .line 4282
    .line 4283
    .line 4284
    .line 4285
    .line 4286
    .line 4287
    .line 4288
    .line 4289
    .line 4290
    .line 4291
    .line 4292
    .line 4293
    .line 4294
    .line 4295
    .line 4296
    .line 4297
    .line 4298
    .line 4299
    .line 4300
    .line 4301
    .line 4302
    .line 4303
    .line 4304
    .line 4305
    .line 4306
    .line 4307
    .line 4308
    .line 4309
    .line 4310
    .line 4311
    .line 4312
    .line 4313
    .line 4314
    .line 4315
    .line 4316
    .line 4317
    .line 4318
    .line 4319
    .line 4320
    .line 4321
    .line 4322
    .line 4323
    .line 4324
    .line 4325
    .line 4326
    .line 4327
    .line 4328
    .line 4329
    .line 4330
    .line 4331
    .line 4332
    .line 4333
    .line 4334
    .line 4335
    .line 4336
    .line 4337
    .line 4338
    .line 4339
    .line 4340
    .line 4341
    .line 4342
    .line 4343
    .line 4344
    .line 4345
    .line 4346
    .line 4347
    .line 4348
    .line 4349
    .line 4350
    .line 4351
    .line 4352
    .line 4353
    .line 4354
    .line 4355
    .line 4356
    .line 4357
    .line 4358
    .line 4359
    .line 4360
    .line 4361
    .line 4362
    .line 4363
    .line 4364
    .line 4365
    .line 4366
    .line 4367
    .line 4368
    .line 4369
    .line 4370
    .line 4371
    .line 4372
    .line 4373
    .line 4374
    .line 4375
    .line 4376
    .line 4377
    .line 4378
    .line 4379
    .line 4380
    .line 4381
    .line 4382
    .line 4383
    .line 4384
    .line 4385
    .line 4386
    .line 4387
    .line 4388
    .line 4389
    .line 4390
    .line 4391
    .line 4392
    .line 4393
    .line 4394
    .line 4395
    .line 4396
    .line 4397
    .line 4398
    .line 4399
    .line 4400
    .line 4401
    .line 4402
    .line 4403
    .line 4404
    .line 4405
    .line 4406
    .line 4407
    .line 4408
    .line 4409
    .line 4410
    .line 4411
    .line 4412
    .line 4413
    .line 4414
    .line 4415
    .line 4416
    .line 4417
    .line 4418
    .line 4419
    .line 4420
    .line 4421
    .line 4422
    .line 4423
    .line 4424
    .line 4425
    .line 4426
    .line 4427
    .line 4428
    .line 4429
    .line 4430
    .line 4431
    .line 4432
    .line 4433
    .line 4434
    .line 4435
    .line 4436
    .line 4437
    .line 4438
    .line 4439
    .line 4440
    .line 4441
    .line 4442
    .line 4443
    .line 4444
    .line 4445
    .line 4446
    .line 4447
    .line 4448
    .line 4449
    .line 4450
    .line 4451
    .line 4452
    .line 4453
    .line 4454
    .line 4455
    .line 4456
    .line 4457
    .line 4458
    .line 4459
    .line 4460
    .line 4461
    .line 4462
    .line 4463
    .line 4464
    .line 4465
    .line 4466
    .line 4467
    .line 4468
    .line 4469
    .line 4470
    .line 4471
    .line 4472
    .line 4473
    .line 4474
    .line 4475
    .line 4476
    .line 4477
    .line 4478
    .line 4479
    .line 4480
    .line 4481
    .line 4482
    .line 4483
    .line 4484
    .line 4485
    .line 4486
    .line 4487
    .line 4488
    .line 4489
    .line 4490
    .line 4491
    .line 4492
    .line 4493
    .line 4494
    .line 4495
    .line 4496
    .line 4497
    .line 4498
    .line 4499
    .line 4500
    .line 4501
    .line 4502
    .line 4503
    .line 4504
    .line 4505
    .line 4506
    .line 4507
    .line 4508
    .line 4509
    .line 4510
    .line 4511
    .line 4512
    .line 4513
    .line 4514
    .line 4515
    .line 4516
    .line 4517
    .line 4518
    .line 4519
    .line 4520
    .line 4521
    .line 4522
    .line 4523
    .line 4524
    .line 4525
    .line 4526
    .line 4527
    .line 4528
    .line 4529
    .line 4530
    .line 4531
    .line 4532
    .line 4533
    .line 4534
    .line 4535
    .line 4536
    .line 4537
    .line 4538
    .line 4539
    .line 4540
    .line 4541
    .line 4542
    .line 4543
    .line 4544
    .line 4545
    .line 4546
    .line 4547
    .line 4548
    .line 4549
    .line 4550
    .line 4551
    .line 4552
    .line 4553
    .line 4554
    .line 4555
    .line 4556
    .line 4557
    .line 4558
    .line 4559
    .line 4560
    .line 4561
    .line 4562
    .line 4563
    .line 4564
    .line 4565
    .line 4566
    .line 4567
    .line 4568
    .line 4569
    .line 4570
    .line 4571
    .line 4572
    .line 4573
    .line 4574
    .line 4575
    .line 4576
    .line 4577
    .line 4578
    .line 4579
    .line 4580
    .line 4581
    .line 4582
    .line 4583
    .line 4584
    .line 4585
    .line 4586
    .line 4587
    .line 4588
    .line 4589
    .line 4590
    .line 4591
    .line 4592
    .line 4593
    .line 4594
    .line 4595
    .line 4596
    .line 4597
    .line 4598
    .line 4599
    .line 4600
    .line 4601
    .line 4602
    .line 4603
    .line 4604
    .line 4605
    .line 4606
    .line 4607
    .line 4608
    .line 4609
    .line 4610
    .line 4611
    .line 4612
    .line 4613
    .line 4614
    .line 4615
    .line 4616
    .line 4617
    .line 4618
.end method

.method public final i(Lq3/l;)V
    .locals 12

    .line 1
    iput-object p1, p0, Ly3/i;->E:Lq3/l;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p0, Ly3/i;->p:I

    .line 5
    .line 6
    iput v0, p0, Ly3/i;->s:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Lq3/u;

    .line 10
    .line 11
    iput-object v1, p0, Ly3/i;->F:[Lq3/u;

    .line 12
    .line 13
    iget-object v2, p0, Ly3/i;->o:LQ3/o;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    aput-object v2, v1, v0

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    iget v3, p0, Ly3/i;->a:I

    .line 23
    .line 24
    and-int/lit8 v3, v3, 0x4

    .line 25
    .line 26
    const/16 v4, 0x64

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    const/4 v5, 0x5

    .line 33
    invoke-interface {p1, v4, v5}, Lq3/l;->u(II)Lq3/u;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    aput-object v4, v1, v2

    .line 38
    .line 39
    const/16 v4, 0x65

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_1
    iget-object v1, p0, Ly3/i;->F:[Lq3/u;

    .line 43
    .line 44
    invoke-static {v2, v1}, Ll4/y;->J(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, [Lq3/u;

    .line 49
    .line 50
    iput-object v1, p0, Ly3/i;->F:[Lq3/u;

    .line 51
    .line 52
    array-length v2, v1

    .line 53
    move v3, v0

    .line 54
    :goto_1
    if-ge v3, v2, :cond_2

    .line 55
    .line 56
    aget-object v5, v1, v3

    .line 57
    .line 58
    sget-object v6, Ly3/i;->J:Lj3/M;

    .line 59
    .line 60
    invoke-interface {v5, v6}, Lq3/u;->e(Lj3/M;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v1, p0, Ly3/i;->c:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    new-array v2, v2, [Lq3/u;

    .line 73
    .line 74
    iput-object v2, p0, Ly3/i;->G:[Lq3/u;

    .line 75
    .line 76
    move v2, v0

    .line 77
    :goto_2
    iget-object v3, p0, Ly3/i;->G:[Lq3/u;

    .line 78
    .line 79
    array-length v3, v3

    .line 80
    if-ge v2, v3, :cond_3

    .line 81
    .line 82
    iget-object v3, p0, Ly3/i;->E:Lq3/l;

    .line 83
    .line 84
    add-int/lit8 v5, v4, 0x1

    .line 85
    .line 86
    const/4 v6, 0x3

    .line 87
    invoke-interface {v3, v4, v6}, Lq3/l;->u(II)Lq3/u;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lj3/M;

    .line 96
    .line 97
    invoke-interface {v3, v4}, Lq3/u;->e(Lj3/M;)V

    .line 98
    .line 99
    .line 100
    iget-object v4, p0, Ly3/i;->G:[Lq3/u;

    .line 101
    .line 102
    aput-object v3, v4, v2

    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    move v4, v5

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    iget-object v1, p0, Ly3/i;->b:Ly3/o;

    .line 109
    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    new-instance v2, Ly3/h;

    .line 113
    .line 114
    iget v1, v1, Ly3/o;->b:I

    .line 115
    .line 116
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v3, Ly3/r;

    .line 121
    .line 122
    new-array v5, v0, [J

    .line 123
    .line 124
    new-array v6, v0, [I

    .line 125
    .line 126
    new-array v8, v0, [J

    .line 127
    .line 128
    new-array v9, v0, [I

    .line 129
    .line 130
    iget-object v4, p0, Ly3/i;->b:Ly3/o;

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const-wide/16 v10, 0x0

    .line 134
    .line 135
    invoke-direct/range {v3 .. v11}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 136
    .line 137
    .line 138
    new-instance v1, Ly3/f;

    .line 139
    .line 140
    invoke-direct {v1, v0, v0, v0, v0}, Ly3/f;-><init>(IIII)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, p1, v3, v1}, Ly3/h;-><init>(Lq3/u;Ly3/r;Ly3/f;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Ly3/i;->d:Landroid/util/SparseArray;

    .line 147
    .line 148
    invoke-virtual {p1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Ly3/i;->E:Lq3/l;

    .line 152
    .line 153
    invoke-interface {p1}, Lq3/l;->i()V

    .line 154
    .line 155
    .line 156
    :cond_4
    return-void
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

.method public final j(Lq3/k;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Ly3/j;->j(Lq3/k;ZZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
    .line 8
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
.end method

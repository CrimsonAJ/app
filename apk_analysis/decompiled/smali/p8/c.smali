.class public final Lp8/c;
.super Lp8/a;
.source "SourceFile"


# instance fields
.field public final d:Li8/y;

.field public e:J

.field public f:Z

.field public final synthetic g:LU6/a;


# direct methods
.method public constructor <init>(LU6/a;Li8/y;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lp8/c;->g:LU6/a;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lp8/a;-><init>(LU6/a;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lp8/c;->d:Li8/y;

    .line 12
    .line 13
    const-wide/16 p1, -0x1

    .line 14
    .line 15
    iput-wide p1, p0, Lp8/c;->e:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lp8/c;->f:Z

    .line 19
    .line 20
    return-void
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
.method public final b0(Lx8/g;J)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_10

    .line 17
    .line 18
    iget-boolean v6, v1, Lp8/a;->b:Z

    .line 19
    .line 20
    if-nez v6, :cond_f

    .line 21
    .line 22
    iget-boolean v6, v1, Lp8/c;->f:Z

    .line 23
    .line 24
    const-wide/16 v7, -0x1

    .line 25
    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    iget-wide v9, v1, Lp8/c;->e:J

    .line 31
    .line 32
    cmp-long v6, v9, v4

    .line 33
    .line 34
    iget-object v11, v1, Lp8/c;->g:LU6/a;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    cmp-long v6, v9, v7

    .line 39
    .line 40
    if-nez v6, :cond_c

    .line 41
    .line 42
    :cond_1
    const-string v6, "expected chunk size and optional extensions but was \""

    .line 43
    .line 44
    cmp-long v9, v9, v7

    .line 45
    .line 46
    if-eqz v9, :cond_2

    .line 47
    .line 48
    iget-object v9, v11, LU6/a;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Lx8/C;

    .line 51
    .line 52
    const-wide v12, 0x7fffffffffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-virtual {v9, v12, v13}, Lx8/C;->a0(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    :cond_2
    :try_start_0
    iget-object v9, v11, LU6/a;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, Lx8/C;

    .line 63
    .line 64
    const-wide/16 v12, 0x1

    .line 65
    .line 66
    invoke-virtual {v9, v12, v13}, Lx8/C;->g0(J)V

    .line 67
    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    move v12, v10

    .line 71
    :goto_0
    add-int/lit8 v13, v12, 0x1

    .line 72
    .line 73
    int-to-long v14, v13

    .line 74
    invoke-virtual {v9, v14, v15}, Lx8/C;->o(J)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    iget-object v15, v9, Lx8/C;->b:Lx8/g;

    .line 79
    .line 80
    if-eqz v14, :cond_8

    .line 81
    .line 82
    move-wide/from16 v16, v4

    .line 83
    .line 84
    int-to-long v4, v12

    .line 85
    invoke-virtual {v15, v4, v5}, Lx8/g;->O(J)B

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    const/16 v5, 0x30

    .line 90
    .line 91
    if-lt v4, v5, :cond_3

    .line 92
    .line 93
    const/16 v5, 0x39

    .line 94
    .line 95
    if-le v4, v5, :cond_5

    .line 96
    .line 97
    :cond_3
    const/16 v5, 0x61

    .line 98
    .line 99
    if-lt v4, v5, :cond_4

    .line 100
    .line 101
    const/16 v5, 0x66

    .line 102
    .line 103
    if-le v4, v5, :cond_5

    .line 104
    .line 105
    :cond_4
    const/16 v5, 0x41

    .line 106
    .line 107
    if-lt v4, v5, :cond_6

    .line 108
    .line 109
    const/16 v5, 0x46

    .line 110
    .line 111
    if-le v4, v5, :cond_5

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    move v12, v13

    .line 115
    move-wide/from16 v4, v16

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    :goto_1
    if-eqz v12, :cond_7

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 122
    .line 123
    const/16 v2, 0x10

    .line 124
    .line 125
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/Y1;->i(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v3, "toString(...)"

    .line 133
    .line 134
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 138
    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-direct {v0, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_8
    move-wide/from16 v16, v4

    .line 148
    .line 149
    :goto_2
    invoke-virtual {v15}, Lx8/g;->l0()J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    iput-wide v4, v1, Lp8/c;->e:J

    .line 154
    .line 155
    iget-object v4, v11, LU6/a;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Lx8/C;

    .line 158
    .line 159
    const-wide v12, 0x7fffffffffffffffL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v12, v13}, Lx8/C;->a0(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, LW7/d;->j0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-wide v12, v1, Lp8/c;->e:J

    .line 177
    .line 178
    cmp-long v5, v12, v16

    .line 179
    .line 180
    if-ltz v5, :cond_e

    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-lez v5, :cond_9

    .line 187
    .line 188
    const-string v5, ";"

    .line 189
    .line 190
    invoke-static {v4, v5, v10}, LW7/l;->L(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    if-eqz v5, :cond_e

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catch_0
    move-exception v0

    .line 198
    goto/16 :goto_7

    .line 199
    .line 200
    :cond_9
    :goto_3
    iget-wide v4, v1, Lp8/c;->e:J

    .line 201
    .line 202
    cmp-long v4, v4, v16

    .line 203
    .line 204
    if-nez v4, :cond_b

    .line 205
    .line 206
    iput-boolean v10, v1, Lp8/c;->f:Z

    .line 207
    .line 208
    iget-object v4, v11, LU6/a;->f:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, LF0/h;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v5, Lf5/o;

    .line 216
    .line 217
    const/4 v6, 0x5

    .line 218
    invoke-direct {v5, v6}, Lf5/o;-><init>(I)V

    .line 219
    .line 220
    .line 221
    :goto_4
    iget-object v6, v4, LF0/h;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v6, Lx8/C;

    .line 224
    .line 225
    iget-wide v9, v4, LF0/h;->b:J

    .line 226
    .line 227
    invoke-virtual {v6, v9, v10}, Lx8/C;->a0(J)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    iget-wide v9, v4, LF0/h;->b:J

    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    int-to-long v12, v12

    .line 238
    sub-long/2addr v9, v12

    .line 239
    iput-wide v9, v4, LF0/h;->b:J

    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-nez v9, :cond_a

    .line 246
    .line 247
    invoke-virtual {v5}, Lf5/o;->z()Li8/w;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    iput-object v4, v11, LU6/a;->g:Ljava/lang/Object;

    .line 252
    .line 253
    iget-object v4, v11, LU6/a;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v4, Li8/E;

    .line 256
    .line 257
    invoke-static {v4}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    iget-object v5, v11, LU6/a;->g:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v5, Li8/w;

    .line 263
    .line 264
    invoke-static {v5}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iget-object v4, v4, Li8/E;->j:Li8/r;

    .line 268
    .line 269
    iget-object v6, v1, Lp8/c;->d:Li8/y;

    .line 270
    .line 271
    invoke-static {v4, v6, v5}, Lo8/c;->b(Li8/r;Li8/y;Li8/w;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Lp8/a;->a()V

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_a
    invoke-virtual {v5, v6}, Lf5/o;->w(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_b
    :goto_5
    iget-boolean v4, v1, Lp8/c;->f:Z

    .line 283
    .line 284
    if-nez v4, :cond_c

    .line 285
    .line 286
    :goto_6
    return-wide v7

    .line 287
    :cond_c
    iget-wide v4, v1, Lp8/c;->e:J

    .line 288
    .line 289
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 290
    .line 291
    .line 292
    move-result-wide v2

    .line 293
    invoke-super {v1, v0, v2, v3}, Lp8/a;->b0(Lx8/g;J)J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    cmp-long v0, v2, v7

    .line 298
    .line 299
    if-eqz v0, :cond_d

    .line 300
    .line 301
    iget-wide v4, v1, Lp8/c;->e:J

    .line 302
    .line 303
    sub-long/2addr v4, v2

    .line 304
    iput-wide v4, v1, Lp8/c;->e:J

    .line 305
    .line 306
    return-wide v2

    .line 307
    :cond_d
    iget-object v0, v11, LU6/a;->c:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Ln8/i;

    .line 310
    .line 311
    invoke-virtual {v0}, Ln8/i;->l()V

    .line 312
    .line 313
    .line 314
    new-instance v0, Ljava/net/ProtocolException;

    .line 315
    .line 316
    const-string v2, "unexpected end of stream"

    .line 317
    .line 318
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Lp8/a;->a()V

    .line 322
    .line 323
    .line 324
    throw v0

    .line 325
    :cond_e
    :try_start_1
    new-instance v0, Ljava/net/ProtocolException;

    .line 326
    .line 327
    new-instance v2, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-wide v5, v1, Lp8/c;->e:J

    .line 333
    .line 334
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const/16 v3, 0x22

    .line 341
    .line 342
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 353
    :goto_7
    new-instance v2, Ljava/net/ProtocolException;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-direct {v2, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v2

    .line 363
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 364
    .line 365
    const-string v2, "closed"

    .line 366
    .line 367
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :cond_10
    const-string v0, "byteCount < 0: "

    .line 372
    .line 373
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/measurement/k1;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v2
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

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp8/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lp8/c;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-static {p0}, Lk8/c;->h(Lx8/I;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lp8/c;->g:LU6/a;

    .line 19
    .line 20
    iget-object v0, v0, LU6/a;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ln8/i;

    .line 23
    .line 24
    invoke-virtual {v0}, Ln8/i;->l()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lp8/a;->a()V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lp8/a;->b:Z

    .line 32
    .line 33
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

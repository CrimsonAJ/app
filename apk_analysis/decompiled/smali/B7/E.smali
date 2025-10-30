.class public final LB7/E;
.super LG7/i;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public s:Ljava/lang/Object;

.field public t:Ljava/util/Iterator;

.field public u:I

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB7/E;->x:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LG7/i;-><init>(LE7/d;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, LB7/E;

    .line 2
    .line 3
    iget-object v1, p0, LB7/E;->x:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LB7/E;-><init>(Ljava/util/Iterator;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LB7/E;->w:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LV7/k;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LB7/E;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB7/E;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB7/E;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, LB7/E;->v:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x64

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_c

    .line 11
    .line 12
    if-eq v1, v2, :cond_b

    .line 13
    .line 14
    if-eq v1, v4, :cond_0

    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    const/4 v6, 0x4

    .line 18
    const/4 v7, 0x3

    .line 19
    if-eq v1, v7, :cond_3

    .line 20
    .line 21
    if-eq v1, v6, :cond_2

    .line 22
    .line 23
    if-ne v1, v4, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_2
    iget-object v1, p0, LB7/E;->s:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LB7/C;

    .line 41
    .line 42
    iget-object v2, p0, LB7/E;->w:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LV7/k;

    .line 45
    .line 46
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, LB7/C;->c()V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_3
    iget-object v1, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 55
    .line 56
    iget-object v8, p0, LB7/E;->s:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v8, LB7/C;

    .line 59
    .line 60
    iget-object v9, p0, LB7/E;->w:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, LV7/k;

    .line 63
    .line 64
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8}, LB7/C;->c()V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_9

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v8}, LB7/C;->b()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    iget v11, v8, LB7/C;->b:I

    .line 85
    .line 86
    if-eq v10, v11, :cond_8

    .line 87
    .line 88
    iget v10, v8, LB7/C;->c:I

    .line 89
    .line 90
    iget v12, v8, LB7/C;->d:I

    .line 91
    .line 92
    add-int/2addr v10, v12

    .line 93
    rem-int/2addr v10, v11

    .line 94
    iget-object v13, v8, LB7/C;->a:[Ljava/lang/Object;

    .line 95
    .line 96
    aput-object p1, v13, v10

    .line 97
    .line 98
    add-int/lit8 v12, v12, 0x1

    .line 99
    .line 100
    iput v12, v8, LB7/C;->d:I

    .line 101
    .line 102
    invoke-virtual {v8}, LB7/C;->b()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-ne p1, v11, :cond_4

    .line 107
    .line 108
    iget p1, v8, LB7/C;->d:I

    .line 109
    .line 110
    if-ge p1, v3, :cond_7

    .line 111
    .line 112
    shr-int/lit8 p1, v11, 0x1

    .line 113
    .line 114
    add-int/2addr v11, p1

    .line 115
    add-int/2addr v11, v2

    .line 116
    if-le v11, v3, :cond_5

    .line 117
    .line 118
    move v11, v3

    .line 119
    :cond_5
    iget p1, v8, LB7/C;->c:I

    .line 120
    .line 121
    if-nez p1, :cond_6

    .line 122
    .line 123
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const-string v10, "copyOf(...)"

    .line 128
    .line 129
    invoke-static {p1, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    new-array p1, v11, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-virtual {v8, p1}, LB7/C;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :goto_1
    new-instance v10, LB7/C;

    .line 140
    .line 141
    iget v8, v8, LB7/C;->d:I

    .line 142
    .line 143
    invoke-direct {v10, v8, p1}, LB7/C;-><init>(I[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v8, v10

    .line 147
    goto :goto_0

    .line 148
    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {p1, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 151
    .line 152
    .line 153
    iput-object v9, p0, LB7/E;->w:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v8, p0, LB7/E;->s:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v1, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 158
    .line 159
    iput v7, p0, LB7/E;->v:I

    .line 160
    .line 161
    invoke-virtual {v9, p1, p0}, LV7/k;->d(Ljava/lang/Object;LG7/i;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string v0, "ring buffer is full"

    .line 168
    .line 169
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_9
    move-object v1, v8

    .line 174
    move-object v2, v9

    .line 175
    :goto_2
    iget p1, v1, LB7/C;->d:I

    .line 176
    .line 177
    if-le p1, v3, :cond_a

    .line 178
    .line 179
    new-instance p1, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 182
    .line 183
    .line 184
    iput-object v2, p0, LB7/E;->w:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v1, p0, LB7/E;->s:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v5, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 189
    .line 190
    iput v6, p0, LB7/E;->v:I

    .line 191
    .line 192
    invoke-virtual {v2, p1, p0}, LV7/k;->d(Ljava/lang/Object;LG7/i;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :cond_a
    invoke-virtual {v1}, LB7/e;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_10

    .line 201
    .line 202
    iput-object v5, p0, LB7/E;->w:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v5, p0, LB7/E;->s:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v5, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 207
    .line 208
    iput v4, p0, LB7/E;->v:I

    .line 209
    .line 210
    invoke-virtual {v2, v1, p0}, LV7/k;->d(Ljava/lang/Object;LG7/i;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_b
    iget v1, p0, LB7/E;->u:I

    .line 215
    .line 216
    iget-object v6, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 217
    .line 218
    iget-object v7, p0, LB7/E;->s:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v7, Ljava/util/ArrayList;

    .line 221
    .line 222
    iget-object v7, p0, LB7/E;->w:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v7, LV7/k;

    .line 225
    .line 226
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    new-instance p1, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 232
    .line 233
    .line 234
    :goto_3
    move-object v8, v7

    .line 235
    move-object v7, v6

    .line 236
    move v6, v1

    .line 237
    goto :goto_4

    .line 238
    :cond_c
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iget-object p1, p0, LB7/E;->w:Ljava/lang/Object;

    .line 242
    .line 243
    move-object v7, p1

    .line 244
    check-cast v7, LV7/k;

    .line 245
    .line 246
    iget-object v6, p0, LB7/E;->x:Ljava/util/Iterator;

    .line 247
    .line 248
    new-instance p1, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    goto :goto_3

    .line 255
    :cond_d
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_f

    .line 260
    .line 261
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    if-lez v1, :cond_e

    .line 266
    .line 267
    add-int/lit8 v1, v1, -0x1

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_e
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-ne v9, v3, :cond_d

    .line 278
    .line 279
    iput-object v8, p0, LB7/E;->w:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object p1, p0, LB7/E;->s:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v7, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 284
    .line 285
    iput v6, p0, LB7/E;->u:I

    .line 286
    .line 287
    iput v2, p0, LB7/E;->v:I

    .line 288
    .line 289
    invoke-virtual {v8, p1, p0}, LV7/k;->d(Ljava/lang/Object;LG7/i;)V

    .line 290
    .line 291
    .line 292
    return-object v0

    .line 293
    :cond_f
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-nez v1, :cond_10

    .line 298
    .line 299
    iput-object v5, p0, LB7/E;->w:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v5, p0, LB7/E;->s:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v5, p0, LB7/E;->t:Ljava/util/Iterator;

    .line 304
    .line 305
    iput v4, p0, LB7/E;->v:I

    .line 306
    .line 307
    invoke-virtual {v8, p1, p0}, LV7/k;->d(Ljava/lang/Object;LG7/i;)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :cond_10
    :goto_5
    sget-object p1, LA7/n;->a:LA7/n;

    .line 312
    .line 313
    return-object p1
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
.end method

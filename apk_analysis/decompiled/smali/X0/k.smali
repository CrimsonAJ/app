.class public final synthetic LX0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX0/l;
.implements LV2/g;
.implements Lj3/e;
.implements Ls6/d;
.implements Lb6/b;
.implements Lf5/g;
.implements Lf5/a;
.implements LP6/a;
.implements LV2/e;
.implements Lf3/f;
.implements LO5/f;
.implements Ll4/i;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LX0/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb6/o;)LU5/b;
    .locals 6

    .line 1
    iget v0, p0, LX0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 7
    .line 8
    iget-object v1, p1, Lb6/o;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :try_start_0
    iget-object v0, p1, Lb6/o;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/n;->a()Lcom/google/crypto/tink/shaded/protobuf/n;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Lh6/Q;->E(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/n;)Lh6/Q;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lh6/Q;->C()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    new-instance v1, Lcom/google/firebase/messaging/s;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {v1, v2, v3}, Lcom/google/firebase/messaging/s;-><init>(IZ)V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    iput-object v2, v1, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object v2, v1, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v2, v1, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 50
    .line 51
    sget-object v3, Lc6/d;->o:Lc6/d;

    .line 52
    .line 53
    iput-object v3, v1, Lcom/google/firebase/messaging/s;->e:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v0}, Lh6/Q;->A()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput-object v3, v1, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v0}, Lh6/Q;->B()Lh6/V;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Lh6/V;->A()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, v1, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v0}, Lh6/Q;->B()Lh6/V;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Lh6/V;->z()Lh6/O;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, Lc6/l;->a(Lh6/O;)Lc6/d;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iput-object v3, v1, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v3, p1, Lb6/o;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lh6/r0;

    .line 100
    .line 101
    invoke-static {v3}, Lc6/l;->b(Lh6/r0;)Lc6/d;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iput-object v3, v1, Lcom/google/firebase/messaging/s;->e:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/google/firebase/messaging/s;->d()Lc6/k;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v3, Lb5/G1;

    .line 112
    .line 113
    const/4 v4, 0x5

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-direct {v3, v4, v5}, Lb5/G1;-><init>(IZ)V

    .line 116
    .line 117
    .line 118
    iput-object v2, v3, Lb5/G1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v2, v3, Lb5/G1;->d:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, v3, Lb5/G1;->b:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {v0}, Lh6/Q;->A()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, Li/G;

    .line 133
    .line 134
    invoke-static {v0}, Lk6/a;->a([B)Lk6/a;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/4 v2, 0x4

    .line 139
    invoke-direct {v1, v2, v0}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v3, Lb5/G1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object p1, p1, Lb6/o;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, Ljava/lang/Integer;

    .line 147
    .line 148
    iput-object p1, v3, Lb5/G1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v3}, Lb5/G1;->d()Lc6/j;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 156
    .line 157
    const-string v0, "Only version 0 keys are accepted"

    .line 158
    .line 159
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/B; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 164
    .line 165
    const-string v0, "Parsing HmacKey failed"

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    const-string v0, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    .line 174
    .line 175
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :pswitch_0
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 180
    .line 181
    iget-object v1, p1, Lb6/o;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_4

    .line 190
    .line 191
    :try_start_1
    iget-object v0, p1, Lb6/o;->c:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 194
    .line 195
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/n;->a()Lcom/google/crypto/tink/shaded/protobuf/n;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v0, v1}, Lh6/b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/n;)Lh6/b;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Lh6/b;->B()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_3

    .line 208
    .line 209
    new-instance v1, Lb5/G1;

    .line 210
    .line 211
    const/4 v2, 0x4

    .line 212
    const/4 v3, 0x0

    .line 213
    invoke-direct {v1, v2, v3}, Lb5/G1;-><init>(IZ)V

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    iput-object v2, v1, Lb5/G1;->b:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v2, v1, Lb5/G1;->c:Ljava/lang/Object;

    .line 220
    .line 221
    sget-object v3, Lc6/d;->f:Lc6/d;

    .line 222
    .line 223
    iput-object v3, v1, Lb5/G1;->d:Ljava/lang/Object;

    .line 224
    .line 225
    invoke-virtual {v0}, Lh6/b;->z()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-virtual {v1, v3}, Lb5/G1;->A(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Lh6/b;->A()Lh6/f;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Lh6/f;->y()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    const/16 v4, 0xa

    .line 245
    .line 246
    if-lt v3, v4, :cond_2

    .line 247
    .line 248
    const/16 v4, 0x10

    .line 249
    .line 250
    if-lt v4, v3, :cond_2

    .line 251
    .line 252
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    iput-object v3, v1, Lb5/G1;->c:Ljava/lang/Object;

    .line 257
    .line 258
    iget-object v3, p1, Lb6/o;->e:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v3, Lh6/r0;

    .line 261
    .line 262
    invoke-static {v3}, Lc6/f;->a(Lh6/r0;)Lc6/d;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    iput-object v3, v1, Lb5/G1;->d:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-virtual {v1}, Lb5/G1;->c()Lc6/e;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v3, Lb5/G1;

    .line 273
    .line 274
    const/4 v4, 0x3

    .line 275
    const/4 v5, 0x0

    .line 276
    invoke-direct {v3, v4, v5}, Lb5/G1;-><init>(IZ)V

    .line 277
    .line 278
    .line 279
    iput-object v2, v3, Lb5/G1;->c:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object v2, v3, Lb5/G1;->d:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v1, v3, Lb5/G1;->b:Ljava/lang/Object;

    .line 284
    .line 285
    invoke-virtual {v0}, Lh6/b;->z()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f()[B

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    new-instance v1, Li/G;

    .line 294
    .line 295
    invoke-static {v0}, Lk6/a;->a([B)Lk6/a;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const/4 v2, 0x4

    .line 300
    invoke-direct {v1, v2, v0}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    iput-object v1, v3, Lb5/G1;->c:Ljava/lang/Object;

    .line 304
    .line 305
    iget-object p1, p1, Lb6/o;->f:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast p1, Ljava/lang/Integer;

    .line 308
    .line 309
    iput-object p1, v3, Lb5/G1;->d:Ljava/lang/Object;

    .line 310
    .line 311
    invoke-virtual {v3}, Lb5/G1;->b()Lc6/a;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    return-object p1

    .line 316
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 317
    .line 318
    const-string v0, "Invalid tag size for AesCmacParameters: "

    .line 319
    .line 320
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw p1

    .line 328
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 329
    .line 330
    const-string v0, "Only version 0 keys are accepted"

    .line 331
    .line 332
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/B; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 336
    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 337
    .line 338
    const-string v0, "Parsing AesCmacKey failed"

    .line 339
    .line 340
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw p1

    .line 344
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 345
    .line 346
    const-string v0, "Wrong type URL in call to AesCmacParameters.parseParameters"

    .line 347
    .line 348
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw p1

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
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

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LX0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk3/e;

    .line 7
    .line 8
    check-cast p1, Ll4/u;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lk3/e;-><init>(Ll4/u;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    new-array v1, v0, [Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"

    .line 20
    .line 21
    invoke-virtual {p1, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-static {}, LY2/j;->a()Landroid/support/v4/media/session/y;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Landroid/support/v4/media/session/y;->V(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Li3/a;->b(I)LV2/d;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v3, v2, Landroid/support/v4/media/session/y;->d:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-static {v3, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_1
    iput-object v3, v2, Landroid/support/v4/media/session/y;->c:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/support/v4/media/session/y;->B()LY2/j;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :pswitch_1
    check-cast p1, La7/e;

    .line 92
    .line 93
    sget-object v0, Lcom/google/firebase/messaging/o;->a:Landroid/support/v4/media/session/y;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 101
    .line 102
    .line 103
    :try_start_1
    invoke-virtual {v0, p1, v1}, Landroid/support/v4/media/session/y;->D(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    .line 105
    .line 106
    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroid/os/Bundle;)Lj3/f;
    .locals 44

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v11, 0x5

    .line 4
    const/4 v12, -0x1

    .line 5
    const-string v13, ""

    .line 6
    .line 7
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const v1, -0x800001

    .line 13
    .line 14
    .line 15
    const/16 v2, 0xd

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x1

    .line 21
    const/16 v7, 0x24

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    move-object/from16 v9, p0

    .line 25
    .line 26
    iget v10, v9, LX0/k;->a:I

    .line 27
    .line 28
    sparse-switch v10, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    new-instance v1, Lb5/G1;

    .line 32
    .line 33
    invoke-direct {v1, v2, v8}, Lb5/G1;-><init>(IZ)V

    .line 34
    .line 35
    .line 36
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/net/Uri;

    .line 45
    .line 46
    iput-object v2, v1, Lb5/G1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, v1, Lb5/G1;->b:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, v1, Lb5/G1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v0, Lj3/V;

    .line 69
    .line 70
    invoke-direct {v0, v1}, Lj3/V;-><init>(Lb5/G1;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :sswitch_0
    new-instance v10, Lj3/T;

    .line 75
    .line 76
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v11

    .line 84
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v16

    .line 92
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v0, v2, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 113
    .line 114
    .line 115
    move-result v18

    .line 116
    move-wide/from16 v13, v16

    .line 117
    .line 118
    move/from16 v17, v2

    .line 119
    .line 120
    move-wide v15, v5

    .line 121
    invoke-direct/range {v10 .. v18}, Lj3/T;-><init>(JJJFF)V

    .line 122
    .line 123
    .line 124
    return-object v10

    .line 125
    :sswitch_1
    new-instance v1, Lj3/O;

    .line 126
    .line 127
    invoke-direct {v1}, Lj3/O;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-wide/16 v10, 0x0

    .line 135
    .line 136
    invoke-virtual {v0, v2, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v12

    .line 140
    cmp-long v2, v12, v10

    .line 141
    .line 142
    if-ltz v2, :cond_0

    .line 143
    .line 144
    move v2, v6

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    move v2, v8

    .line 147
    :goto_0
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 148
    .line 149
    .line 150
    iput-wide v12, v1, Lj3/O;->a:J

    .line 151
    .line 152
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const-wide/high16 v12, -0x8000000000000000L

    .line 157
    .line 158
    invoke-virtual {v0, v2, v12, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v14

    .line 162
    cmp-long v2, v14, v12

    .line 163
    .line 164
    if-eqz v2, :cond_2

    .line 165
    .line 166
    cmp-long v2, v14, v10

    .line 167
    .line 168
    if-ltz v2, :cond_1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_1
    move v6, v8

    .line 172
    :cond_2
    :goto_1
    invoke-static {v6}, Ll4/a;->h(Z)V

    .line 173
    .line 174
    .line 175
    iput-wide v14, v1, Lj3/O;->b:J

    .line 176
    .line 177
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    iput-boolean v2, v1, Lj3/O;->c:Z

    .line 186
    .line 187
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iput-boolean v2, v1, Lj3/O;->d:Z

    .line 196
    .line 197
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iput-boolean v0, v1, Lj3/O;->e:Z

    .line 206
    .line 207
    new-instance v0, Lj3/Q;

    .line 208
    .line 209
    invoke-direct {v0, v1}, Lj3/P;-><init>(Lj3/O;)V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :sswitch_2
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v0, v2, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v17

    .line 221
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    if-nez v2, :cond_3

    .line 233
    .line 234
    sget-object v1, Lj3/T;->f:Lj3/T;

    .line 235
    .line 236
    move-object/from16 v20, v1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    new-instance v18, Lj3/T;

    .line 240
    .line 241
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {v2, v8, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v19

    .line 249
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v2, v6, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v21

    .line 257
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-virtual {v2, v6, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 262
    .line 263
    .line 264
    move-result-wide v23

    .line 265
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-virtual {v2, v6, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 270
    .line 271
    .line 272
    move-result v25

    .line 273
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-virtual {v2, v6, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 278
    .line 279
    .line 280
    move-result v26

    .line 281
    invoke-direct/range {v18 .. v26}, Lj3/T;-><init>(JJJFF)V

    .line 282
    .line 283
    .line 284
    move-object/from16 v20, v18

    .line 285
    .line 286
    :goto_2
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    if-nez v1, :cond_4

    .line 295
    .line 296
    sget-object v1, Lj3/b0;->Z:Lj3/b0;

    .line 297
    .line 298
    :goto_3
    move-object/from16 v21, v1

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_4
    sget-object v2, Lj3/b0;->f0:Lj3/Z;

    .line 302
    .line 303
    invoke-virtual {v2, v1}, Lj3/Z;->c(Landroid/os/Bundle;)Lj3/f;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, Lj3/b0;

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :goto_4
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    if-nez v1, :cond_5

    .line 319
    .line 320
    sget-object v1, Lj3/Q;->g:Lj3/Q;

    .line 321
    .line 322
    :goto_5
    move-object/from16 v18, v1

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_5
    sget-object v2, Lj3/P;->f:LX0/k;

    .line 326
    .line 327
    invoke-virtual {v2, v1}, LX0/k;->c(Landroid/os/Bundle;)Lj3/f;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    check-cast v1, Lj3/Q;

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :goto_6
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-nez v0, :cond_6

    .line 343
    .line 344
    sget-object v0, Lj3/V;->c:Lj3/V;

    .line 345
    .line 346
    :goto_7
    move-object/from16 v22, v0

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_6
    sget-object v1, Lj3/V;->d:LX0/k;

    .line 350
    .line 351
    invoke-virtual {v1, v0}, LX0/k;->c(Landroid/os/Bundle;)Lj3/f;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, Lj3/V;

    .line 356
    .line 357
    goto :goto_7

    .line 358
    :goto_8
    new-instance v16, Lj3/Y;

    .line 359
    .line 360
    const/16 v19, 0x0

    .line 361
    .line 362
    invoke-direct/range {v16 .. v22}, Lj3/Y;-><init>(Ljava/lang/String;Lj3/Q;Lj3/U;Lj3/T;Lj3/b0;Lj3/V;)V

    .line 363
    .line 364
    .line 365
    return-object v16

    .line 366
    :sswitch_3
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v0, v1, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-nez v1, :cond_7

    .line 375
    .line 376
    move v1, v6

    .line 377
    goto :goto_9

    .line 378
    :cond_7
    move v1, v8

    .line 379
    :goto_9
    invoke-static {v1}, Ll4/a;->h(Z)V

    .line 380
    .line 381
    .line 382
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_8

    .line 391
    .line 392
    new-instance v1, Lj3/N;

    .line 393
    .line 394
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    invoke-direct {v1, v0}, Lj3/N;-><init>(Z)V

    .line 403
    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_8
    new-instance v1, Lj3/N;

    .line 407
    .line 408
    invoke-direct {v1}, Lj3/N;-><init>()V

    .line 409
    .line 410
    .line 411
    :goto_a
    return-object v1

    .line 412
    :sswitch_4
    new-instance v1, Lj3/L;

    .line 413
    .line 414
    invoke-direct {v1}, Lj3/L;-><init>()V

    .line 415
    .line 416
    .line 417
    if-eqz v0, :cond_9

    .line 418
    .line 419
    const-class v10, Ll4/a;

    .line 420
    .line 421
    invoke-virtual {v10}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    sget v13, Ll4/y;->a:I

    .line 426
    .line 427
    invoke-virtual {v0, v10}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 428
    .line 429
    .line 430
    :cond_9
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v10

    .line 434
    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    sget-object v14, Lj3/M;->Z:Lj3/M;

    .line 439
    .line 440
    iget-object v13, v14, Lj3/M;->a:Ljava/lang/String;

    .line 441
    .line 442
    if-eqz v10, :cond_a

    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_a
    move-object v10, v13

    .line 446
    :goto_b
    iput-object v10, v1, Lj3/L;->a:Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    if-eqz v10, :cond_b

    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_b
    iget-object v10, v14, Lj3/M;->b:Ljava/lang/String;

    .line 460
    .line 461
    :goto_c
    iput-object v10, v1, Lj3/L;->b:Ljava/lang/String;

    .line 462
    .line 463
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    if-eqz v10, :cond_c

    .line 472
    .line 473
    goto :goto_d

    .line 474
    :cond_c
    iget-object v10, v14, Lj3/M;->c:Ljava/lang/String;

    .line 475
    .line 476
    :goto_d
    iput-object v10, v1, Lj3/L;->c:Ljava/lang/String;

    .line 477
    .line 478
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    iget v13, v14, Lj3/M;->d:I

    .line 483
    .line 484
    invoke-virtual {v0, v10, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    iput v10, v1, Lj3/L;->d:I

    .line 489
    .line 490
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    iget v10, v14, Lj3/M;->e:I

    .line 495
    .line 496
    invoke-virtual {v0, v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    iput v3, v1, Lj3/L;->e:I

    .line 501
    .line 502
    invoke-static {v11, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    iget v10, v14, Lj3/M;->f:I

    .line 507
    .line 508
    invoke-virtual {v0, v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    iput v3, v1, Lj3/L;->f:I

    .line 513
    .line 514
    const/4 v3, 0x6

    .line 515
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    iget v10, v14, Lj3/M;->g:I

    .line 520
    .line 521
    invoke-virtual {v0, v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    iput v3, v1, Lj3/L;->g:I

    .line 526
    .line 527
    const/4 v3, 0x7

    .line 528
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    if-eqz v3, :cond_d

    .line 537
    .line 538
    goto :goto_e

    .line 539
    :cond_d
    iget-object v3, v14, Lj3/M;->i:Ljava/lang/String;

    .line 540
    .line 541
    :goto_e
    iput-object v3, v1, Lj3/L;->h:Ljava/lang/String;

    .line 542
    .line 543
    const/16 v3, 0x8

    .line 544
    .line 545
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    check-cast v3, LD3/c;

    .line 554
    .line 555
    if-eqz v3, :cond_e

    .line 556
    .line 557
    goto :goto_f

    .line 558
    :cond_e
    iget-object v3, v14, Lj3/M;->j:LD3/c;

    .line 559
    .line 560
    :goto_f
    iput-object v3, v1, Lj3/L;->i:LD3/c;

    .line 561
    .line 562
    const/16 v3, 0x9

    .line 563
    .line 564
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    if-eqz v3, :cond_f

    .line 573
    .line 574
    goto :goto_10

    .line 575
    :cond_f
    iget-object v3, v14, Lj3/M;->k:Ljava/lang/String;

    .line 576
    .line 577
    :goto_10
    iput-object v3, v1, Lj3/L;->j:Ljava/lang/String;

    .line 578
    .line 579
    const/16 v3, 0xa

    .line 580
    .line 581
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    if-eqz v3, :cond_10

    .line 590
    .line 591
    goto :goto_11

    .line 592
    :cond_10
    iget-object v3, v14, Lj3/M;->l:Ljava/lang/String;

    .line 593
    .line 594
    :goto_11
    iput-object v3, v1, Lj3/L;->k:Ljava/lang/String;

    .line 595
    .line 596
    const/16 v3, 0xb

    .line 597
    .line 598
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    iget v10, v14, Lj3/M;->m:I

    .line 603
    .line 604
    invoke-virtual {v0, v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    iput v3, v1, Lj3/L;->l:I

    .line 609
    .line 610
    new-instance v3, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 613
    .line 614
    .line 615
    move v10, v8

    .line 616
    :goto_12
    new-instance v11, Ljava/lang/StringBuilder;

    .line 617
    .line 618
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 619
    .line 620
    .line 621
    const/16 v13, 0xc

    .line 622
    .line 623
    invoke-static {v13, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v15

    .line 627
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    const-string v13, "_"

    .line 631
    .line 632
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-static {v10, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v13

    .line 639
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v11

    .line 646
    invoke-virtual {v0, v11}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 647
    .line 648
    .line 649
    move-result-object v11

    .line 650
    if-nez v11, :cond_12

    .line 651
    .line 652
    iput-object v3, v1, Lj3/L;->m:Ljava/util/List;

    .line 653
    .line 654
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    check-cast v2, Ln3/g;

    .line 663
    .line 664
    iput-object v2, v1, Lj3/L;->n:Ln3/g;

    .line 665
    .line 666
    const/16 v2, 0xe

    .line 667
    .line 668
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    iget-wide v10, v14, Lj3/M;->p:J

    .line 673
    .line 674
    invoke-virtual {v0, v2, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 675
    .line 676
    .line 677
    move-result-wide v2

    .line 678
    iput-wide v2, v1, Lj3/L;->o:J

    .line 679
    .line 680
    const/16 v2, 0xf

    .line 681
    .line 682
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    iget v3, v14, Lj3/M;->q:I

    .line 687
    .line 688
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    iput v2, v1, Lj3/L;->p:I

    .line 693
    .line 694
    const/16 v2, 0x10

    .line 695
    .line 696
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    iget v3, v14, Lj3/M;->r:I

    .line 701
    .line 702
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    iput v2, v1, Lj3/L;->q:I

    .line 707
    .line 708
    const/16 v2, 0x11

    .line 709
    .line 710
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    iget v3, v14, Lj3/M;->s:F

    .line 715
    .line 716
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    iput v2, v1, Lj3/L;->r:F

    .line 721
    .line 722
    const/16 v2, 0x12

    .line 723
    .line 724
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    iget v3, v14, Lj3/M;->t:I

    .line 729
    .line 730
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    iput v2, v1, Lj3/L;->s:I

    .line 735
    .line 736
    const/16 v2, 0x13

    .line 737
    .line 738
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    iget v3, v14, Lj3/M;->u:F

    .line 743
    .line 744
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    iput v2, v1, Lj3/L;->t:F

    .line 749
    .line 750
    const/16 v2, 0x14

    .line 751
    .line 752
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    iput-object v2, v1, Lj3/L;->u:[B

    .line 761
    .line 762
    const/16 v2, 0x15

    .line 763
    .line 764
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    iget v3, v14, Lj3/M;->w:I

    .line 769
    .line 770
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    iput v2, v1, Lj3/L;->v:I

    .line 775
    .line 776
    const/16 v2, 0x16

    .line 777
    .line 778
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    if-eqz v2, :cond_11

    .line 787
    .line 788
    new-instance v3, Lm4/b;

    .line 789
    .line 790
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v8

    .line 794
    invoke-virtual {v2, v8, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 795
    .line 796
    .line 797
    move-result v8

    .line 798
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    invoke-virtual {v2, v6, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 803
    .line 804
    .line 805
    move-result v6

    .line 806
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    invoke-virtual {v2, v5, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-direct {v3, v8, v6, v5, v2}, Lm4/b;-><init>(III[B)V

    .line 823
    .line 824
    .line 825
    iput-object v3, v1, Lj3/L;->w:Lm4/b;

    .line 826
    .line 827
    :cond_11
    const/16 v2, 0x17

    .line 828
    .line 829
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    iget v3, v14, Lj3/M;->y:I

    .line 834
    .line 835
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    iput v2, v1, Lj3/L;->x:I

    .line 840
    .line 841
    const/16 v2, 0x18

    .line 842
    .line 843
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    iget v3, v14, Lj3/M;->z:I

    .line 848
    .line 849
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    iput v2, v1, Lj3/L;->y:I

    .line 854
    .line 855
    const/16 v2, 0x19

    .line 856
    .line 857
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    iget v3, v14, Lj3/M;->A:I

    .line 862
    .line 863
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    iput v2, v1, Lj3/L;->z:I

    .line 868
    .line 869
    const/16 v2, 0x1a

    .line 870
    .line 871
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    iget v3, v14, Lj3/M;->B:I

    .line 876
    .line 877
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    iput v2, v1, Lj3/L;->A:I

    .line 882
    .line 883
    const/16 v2, 0x1b

    .line 884
    .line 885
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    iget v3, v14, Lj3/M;->C:I

    .line 890
    .line 891
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    iput v2, v1, Lj3/L;->B:I

    .line 896
    .line 897
    const/16 v2, 0x1c

    .line 898
    .line 899
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    iget v3, v14, Lj3/M;->D:I

    .line 904
    .line 905
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    iput v2, v1, Lj3/L;->C:I

    .line 910
    .line 911
    const/16 v2, 0x1d

    .line 912
    .line 913
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    iget v3, v14, Lj3/M;->X:I

    .line 918
    .line 919
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    iput v0, v1, Lj3/L;->D:I

    .line 924
    .line 925
    new-instance v0, Lj3/M;

    .line 926
    .line 927
    invoke-direct {v0, v1}, Lj3/M;-><init>(Lj3/L;)V

    .line 928
    .line 929
    .line 930
    return-object v0

    .line 931
    :cond_12
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    add-int/2addr v10, v6

    .line 935
    goto/16 :goto_12

    .line 936
    .line 937
    :sswitch_5
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    if-nez v2, :cond_13

    .line 957
    .line 958
    sget-object v2, LP5/F;->b:LP5/D;

    .line 959
    .line 960
    sget-object v2, LP5/S;->e:LP5/S;

    .line 961
    .line 962
    goto :goto_13

    .line 963
    :cond_13
    sget-object v3, Lj3/M;->f0:LX0/k;

    .line 964
    .line 965
    invoke-static {v3, v2}, Ll4/a;->x(Lj3/e;Ljava/util/ArrayList;)LP5/S;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    :goto_13
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    invoke-virtual {v1, v3, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    new-instance v3, LN3/m0;

    .line 978
    .line 979
    new-array v4, v8, [Lj3/M;

    .line 980
    .line 981
    invoke-virtual {v2, v4}, LP5/A;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    check-cast v2, [Lj3/M;

    .line 986
    .line 987
    invoke-direct {v3, v1, v2}, LN3/m0;-><init>(Ljava/lang/String;[Lj3/M;)V

    .line 988
    .line 989
    .line 990
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    .line 1000
    .line 1001
    new-instance v1, Li4/t;

    .line 1002
    .line 1003
    array-length v2, v0

    .line 1004
    if-nez v2, :cond_14

    .line 1005
    .line 1006
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1007
    .line 1008
    goto :goto_14

    .line 1009
    :cond_14
    new-instance v2, LR5/a;

    .line 1010
    .line 1011
    array-length v4, v0

    .line 1012
    invoke-direct {v2, v8, v4, v0}, LR5/a;-><init>(II[I)V

    .line 1013
    .line 1014
    .line 1015
    move-object v0, v2

    .line 1016
    :goto_14
    invoke-direct {v1, v3, v0}, Li4/t;-><init>(LN3/m0;Ljava/util/List;)V

    .line 1017
    .line 1018
    .line 1019
    return-object v1

    .line 1020
    :sswitch_6
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v10

    .line 1024
    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v10

    .line 1028
    const/4 v12, 0x0

    .line 1029
    if-eqz v10, :cond_15

    .line 1030
    .line 1031
    move-object/from16 v27, v10

    .line 1032
    .line 1033
    goto :goto_15

    .line 1034
    :cond_15
    move-object/from16 v27, v12

    .line 1035
    .line 1036
    :goto_15
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v10

    .line 1040
    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v10

    .line 1044
    check-cast v10, Landroid/text/Layout$Alignment;

    .line 1045
    .line 1046
    if-eqz v10, :cond_16

    .line 1047
    .line 1048
    move-object/from16 v28, v10

    .line 1049
    .line 1050
    goto :goto_16

    .line 1051
    :cond_16
    move-object/from16 v28, v12

    .line 1052
    .line 1053
    :goto_16
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v5

    .line 1057
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v5

    .line 1061
    check-cast v5, Landroid/text/Layout$Alignment;

    .line 1062
    .line 1063
    if-eqz v5, :cond_17

    .line 1064
    .line 1065
    move-object/from16 v29, v5

    .line 1066
    .line 1067
    goto :goto_17

    .line 1068
    :cond_17
    move-object/from16 v29, v12

    .line 1069
    .line 1070
    :goto_17
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    check-cast v4, Landroid/graphics/Bitmap;

    .line 1079
    .line 1080
    if-eqz v4, :cond_18

    .line 1081
    .line 1082
    move-object/from16 v30, v4

    .line 1083
    .line 1084
    goto :goto_18

    .line 1085
    :cond_18
    move-object/from16 v30, v12

    .line 1086
    .line 1087
    :goto_18
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v4

    .line 1091
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v4

    .line 1095
    const/high16 v5, -0x80000000

    .line 1096
    .line 1097
    if-eqz v4, :cond_19

    .line 1098
    .line 1099
    invoke-static {v11, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v4

    .line 1103
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v4

    .line 1107
    if-eqz v4, :cond_19

    .line 1108
    .line 1109
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v3

    .line 1113
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    invoke-static {v11, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    move/from16 v31, v3

    .line 1126
    .line 1127
    move/from16 v32, v4

    .line 1128
    .line 1129
    :goto_19
    const/4 v3, 0x6

    .line 1130
    goto :goto_1a

    .line 1131
    :cond_19
    move/from16 v31, v1

    .line 1132
    .line 1133
    move/from16 v32, v5

    .line 1134
    .line 1135
    goto :goto_19

    .line 1136
    :goto_1a
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v4

    .line 1144
    if-eqz v4, :cond_1a

    .line 1145
    .line 1146
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1151
    .line 1152
    .line 1153
    move-result v3

    .line 1154
    move/from16 v33, v3

    .line 1155
    .line 1156
    :goto_1b
    const/4 v3, 0x7

    .line 1157
    goto :goto_1c

    .line 1158
    :cond_1a
    move/from16 v33, v5

    .line 1159
    .line 1160
    goto :goto_1b

    .line 1161
    :goto_1c
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v4

    .line 1165
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v4

    .line 1169
    if-eqz v4, :cond_1b

    .line 1170
    .line 1171
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v3

    .line 1175
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1176
    .line 1177
    .line 1178
    move-result v3

    .line 1179
    move/from16 v34, v3

    .line 1180
    .line 1181
    :goto_1d
    const/16 v3, 0x8

    .line 1182
    .line 1183
    goto :goto_1e

    .line 1184
    :cond_1b
    move/from16 v34, v1

    .line 1185
    .line 1186
    goto :goto_1d

    .line 1187
    :goto_1e
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v4

    .line 1191
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1192
    .line 1193
    .line 1194
    move-result v4

    .line 1195
    if-eqz v4, :cond_1c

    .line 1196
    .line 1197
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v3

    .line 1201
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1202
    .line 1203
    .line 1204
    move-result v3

    .line 1205
    move/from16 v35, v3

    .line 1206
    .line 1207
    :goto_1f
    const/16 v3, 0xa

    .line 1208
    .line 1209
    goto :goto_20

    .line 1210
    :cond_1c
    move/from16 v35, v5

    .line 1211
    .line 1212
    goto :goto_1f

    .line 1213
    :goto_20
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v4

    .line 1217
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    if-eqz v4, :cond_1d

    .line 1222
    .line 1223
    const/16 v4, 0x9

    .line 1224
    .line 1225
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v10

    .line 1229
    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v10

    .line 1233
    if-eqz v10, :cond_1d

    .line 1234
    .line 1235
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1248
    .line 1249
    .line 1250
    move-result v4

    .line 1251
    move/from16 v37, v3

    .line 1252
    .line 1253
    move/from16 v36, v4

    .line 1254
    .line 1255
    :goto_21
    const/16 v3, 0xb

    .line 1256
    .line 1257
    goto :goto_22

    .line 1258
    :cond_1d
    move/from16 v37, v1

    .line 1259
    .line 1260
    move/from16 v36, v5

    .line 1261
    .line 1262
    goto :goto_21

    .line 1263
    :goto_22
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v4

    .line 1271
    if-eqz v4, :cond_1e

    .line 1272
    .line 1273
    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v3

    .line 1277
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1278
    .line 1279
    .line 1280
    move-result v3

    .line 1281
    move/from16 v38, v3

    .line 1282
    .line 1283
    :goto_23
    const/16 v13, 0xc

    .line 1284
    .line 1285
    goto :goto_24

    .line 1286
    :cond_1e
    move/from16 v38, v1

    .line 1287
    .line 1288
    goto :goto_23

    .line 1289
    :goto_24
    invoke-static {v13, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    if-eqz v3, :cond_1f

    .line 1298
    .line 1299
    invoke-static {v13, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v1

    .line 1303
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    :cond_1f
    move/from16 v39, v1

    .line 1308
    .line 1309
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v1

    .line 1317
    if-eqz v1, :cond_20

    .line 1318
    .line 1319
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v1

    .line 1323
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    :goto_25
    move/from16 v41, v1

    .line 1328
    .line 1329
    const/16 v2, 0xe

    .line 1330
    .line 1331
    goto :goto_26

    .line 1332
    :cond_20
    const/high16 v1, -0x1000000

    .line 1333
    .line 1334
    move v6, v8

    .line 1335
    goto :goto_25

    .line 1336
    :goto_26
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v1

    .line 1344
    if-nez v1, :cond_21

    .line 1345
    .line 1346
    move/from16 v40, v8

    .line 1347
    .line 1348
    :goto_27
    const/16 v2, 0xf

    .line 1349
    .line 1350
    goto :goto_28

    .line 1351
    :cond_21
    move/from16 v40, v6

    .line 1352
    .line 1353
    goto :goto_27

    .line 1354
    :goto_28
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v1

    .line 1362
    if-eqz v1, :cond_22

    .line 1363
    .line 1364
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1369
    .line 1370
    .line 1371
    move-result v5

    .line 1372
    :cond_22
    move/from16 v42, v5

    .line 1373
    .line 1374
    const/16 v2, 0x10

    .line 1375
    .line 1376
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v1

    .line 1384
    if-eqz v1, :cond_23

    .line 1385
    .line 1386
    invoke-static {v2, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1

    .line 1390
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 1391
    .line 1392
    .line 1393
    move-result v0

    .line 1394
    :goto_29
    move/from16 v43, v0

    .line 1395
    .line 1396
    goto :goto_2a

    .line 1397
    :cond_23
    const/4 v0, 0x0

    .line 1398
    goto :goto_29

    .line 1399
    :goto_2a
    new-instance v26, LY3/b;

    .line 1400
    .line 1401
    invoke-direct/range {v26 .. v43}, LY3/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 1402
    .line 1403
    .line 1404
    return-object v26

    .line 1405
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_6
        0x10 -> :sswitch_5
        0x18 -> :sswitch_4
        0x19 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
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
.end method

.method public e(LY2/r;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LX0/k;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->a(LY2/r;)Li7/s;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :sswitch_0
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->b(LY2/r;)Li7/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :sswitch_1
    new-instance v0, Lb7/b;

    .line 17
    .line 18
    const-class v1, Lb7/a;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, LY2/r;->M(Ljava/lang/Class;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object v1, Lb7/c;->c:Lb7/c;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const-class v2, Lb7/c;

    .line 29
    .line 30
    monitor-enter v2

    .line 31
    :try_start_0
    sget-object v1, Lb7/c;->c:Lb7/c;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    new-instance v1, Lb7/c;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v1, v3}, Lb7/c;-><init>(I)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lb7/c;->c:Lb7/c;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    monitor-exit v2

    .line 47
    goto :goto_2

    .line 48
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_2
    invoke-direct {v0, p1, v1}, Lb7/b;-><init>(Ljava/util/Set;Lb7/c;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    nop

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
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
.end method

.method public f(LX0/j;LX0/m;)V
    .locals 1

    .line 1
    iget v0, p0, LX0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LX0/j;->e()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-interface {p1}, LX0/j;->d()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-interface {p1, p2}, LX0/j;->a(LX0/m;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public i(Lf5/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p1, p0, LX0/k;->a:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    const/16 p1, 0x193

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LX0/k;->a:I

    .line 2
    .line 3
    check-cast p1, Lj3/p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lj3/p0;->l()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {p1}, Lj3/p0;->m()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    new-instance v0, LA7/b;

    .line 17
    .line 18
    const-string v1, "Player release timed out."

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lj3/m;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    const/16 v3, 0x3eb

    .line 27
    .line 28
    invoke-direct {v1, v2, v0, v3}, Lj3/m;-><init>(ILjava/lang/Exception;I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v1}, Lj3/p0;->G(Lj3/m;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 36
    .line 37
    .line 38
.end method

.method public s(Ljava/lang/Object;)Lf5/q;
    .locals 0

    .line 1
    check-cast p1, Ld7/h;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
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

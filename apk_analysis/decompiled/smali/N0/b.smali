.class public final LN0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN0/b;->a:I

    iput-object p2, p0, LN0/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/w;Landroidx/lifecycle/o;)V
    .locals 8

    .line 1
    iget v0, p0, LN0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lw0/c;->a:[I

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    aget p2, v0, p2

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iget-object v1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lw0/d;

    .line 18
    .line 19
    if-eq p2, v0, :cond_b

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eq p2, v0, :cond_8

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-eq p2, v0, :cond_4

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    if-eq p2, v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    check-cast p1, Li0/n;

    .line 34
    .line 35
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object p2, p2, Lu0/o;->f:Lb8/H;

    .line 40
    .line 41
    iget-object p2, p2, Lb8/H;->a:Lb8/F;

    .line 42
    .line 43
    check-cast p2, Lb8/Q;

    .line 44
    .line 45
    invoke-virtual {p2}, Lb8/Q;->h()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v3, v0

    .line 66
    check-cast v3, Lu0/m;

    .line 67
    .line 68
    iget-object v3, v3, Lu0/m;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v4, p1, Li0/v;->y:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    check-cast v2, Lu0/m;

    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2, v2}, Lu0/o;->b(Lu0/m;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object p1, p1, Li0/v;->m0:Landroidx/lifecycle/y;

    .line 92
    .line 93
    invoke-virtual {p1, p0}, Landroidx/lifecycle/y;->g0(Landroidx/lifecycle/v;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_4
    check-cast p1, Li0/n;

    .line 99
    .line 100
    invoke-virtual {p1}, Li0/n;->h0()Landroid/app/Dialog;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2}, Landroid/app/Dialog;->isShowing()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_f

    .line 109
    .line 110
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget-object p2, p2, Lu0/o;->e:Lb8/H;

    .line 115
    .line 116
    iget-object p2, p2, Lb8/H;->a:Lb8/F;

    .line 117
    .line 118
    check-cast p2, Lb8/Q;

    .line 119
    .line 120
    invoke-virtual {p2}, Lb8/Q;->h()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-interface {p2, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_6

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Lu0/m;

    .line 145
    .line 146
    iget-object v2, v2, Lu0/m;->f:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v3, p1, Li0/v;->y:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_5

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    goto :goto_1

    .line 161
    :cond_6
    const/4 v0, -0x1

    .line 162
    :goto_1
    invoke-static {p2, v0}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Lu0/m;

    .line 167
    .line 168
    invoke-static {p2}, LB7/k;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {p2, v2}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-nez p2, :cond_7

    .line 177
    .line 178
    new-instance p2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v3, "Dialog "

    .line 181
    .line 182
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p1, " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"

    .line 189
    .line 190
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string p2, "DialogFragmentNavigator"

    .line 198
    .line 199
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    :cond_7
    if-eqz v2, :cond_f

    .line 203
    .line 204
    const/4 p1, 0x0

    .line 205
    invoke-virtual {v1, v0, v2, p1}, Lw0/d;->l(ILu0/m;Z)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_4

    .line 209
    .line 210
    :cond_8
    check-cast p1, Li0/n;

    .line 211
    .line 212
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    iget-object p2, p2, Lu0/o;->f:Lb8/H;

    .line 217
    .line 218
    iget-object p2, p2, Lb8/H;->a:Lb8/F;

    .line 219
    .line 220
    check-cast p2, Lb8/Q;

    .line 221
    .line 222
    invoke-virtual {p2}, Lb8/Q;->h()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    check-cast p2, Ljava/lang/Iterable;

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    :cond_9
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_a

    .line 237
    .line 238
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    move-object v3, v0

    .line 243
    check-cast v3, Lu0/m;

    .line 244
    .line 245
    iget-object v3, v3, Lu0/m;->f:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v4, p1, Li0/v;->y:Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_9

    .line 254
    .line 255
    move-object v2, v0

    .line 256
    goto :goto_2

    .line 257
    :cond_a
    check-cast v2, Lu0/m;

    .line 258
    .line 259
    if-eqz v2, :cond_f

    .line 260
    .line 261
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p1, v2}, Lu0/o;->b(Lu0/m;)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_b
    check-cast p1, Li0/n;

    .line 270
    .line 271
    invoke-virtual {v1}, Lu0/V;->b()Lu0/o;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    iget-object p2, p2, Lu0/o;->e:Lb8/H;

    .line 276
    .line 277
    iget-object p2, p2, Lb8/H;->a:Lb8/F;

    .line 278
    .line 279
    check-cast p2, Lb8/Q;

    .line 280
    .line 281
    invoke-virtual {p2}, Lb8/Q;->h()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    check-cast p2, Ljava/lang/Iterable;

    .line 286
    .line 287
    instance-of v0, p2, Ljava/util/Collection;

    .line 288
    .line 289
    if-eqz v0, :cond_c

    .line 290
    .line 291
    move-object v0, p2

    .line 292
    check-cast v0, Ljava/util/Collection;

    .line 293
    .line 294
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_c

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_c
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    :cond_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_e

    .line 310
    .line 311
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Lu0/m;

    .line 316
    .line 317
    iget-object v0, v0, Lu0/m;->f:Ljava/lang/String;

    .line 318
    .line 319
    iget-object v1, p1, Li0/v;->y:Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_d

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_e
    :goto_3
    invoke-virtual {p1}, Li0/n;->e0()V

    .line 329
    .line 330
    .line 331
    :cond_f
    :goto_4
    return-void

    .line 332
    :pswitch_0
    sget-object p1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 333
    .line 334
    if-ne p2, p1, :cond_10

    .line 335
    .line 336
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast p1, Lv7/h;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    const/4 p2, 0x0

    .line 344
    iput-object p2, p1, Lv7/h;->a:Landroid/view/LayoutInflater;

    .line 345
    .line 346
    iput-object p2, p1, Lv7/h;->b:Landroid/view/LayoutInflater;

    .line 347
    .line 348
    :cond_10
    return-void

    .line 349
    :pswitch_1
    sget-object p1, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 350
    .line 351
    if-ne p2, p1, :cond_11

    .line 352
    .line 353
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast p1, Li0/v;

    .line 356
    .line 357
    iget-object p1, p1, Li0/v;->Y:Landroid/view/View;

    .line 358
    .line 359
    if-eqz p1, :cond_11

    .line 360
    .line 361
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 362
    .line 363
    .line 364
    :cond_11
    return-void

    .line 365
    :pswitch_2
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast p1, Lc1/b;

    .line 368
    .line 369
    const/4 p2, 0x0

    .line 370
    invoke-virtual {p1, p2}, Lc1/b;->b(Z)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :pswitch_3
    sget-object v0, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 375
    .line 376
    if-ne p2, v0, :cond_12

    .line 377
    .line 378
    invoke-interface {p1}, Landroidx/lifecycle/w;->x()LD/n;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-virtual {p1, p0}, LD/n;->g0(Landroidx/lifecycle/v;)V

    .line 383
    .line 384
    .line 385
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast p1, Landroidx/lifecycle/Z;

    .line 388
    .line 389
    invoke-virtual {p1}, Landroidx/lifecycle/Z;->b()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 396
    .line 397
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw p2

    .line 417
    :pswitch_4
    new-instance p1, Ljava/util/HashMap;

    .line 418
    .line 419
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 420
    .line 421
    .line 422
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast p1, [Landroidx/lifecycle/j;

    .line 425
    .line 426
    array-length p2, p1

    .line 427
    const/4 v0, 0x0

    .line 428
    const/4 v1, 0x0

    .line 429
    if-gtz p2, :cond_14

    .line 430
    .line 431
    array-length p2, p1

    .line 432
    if-gtz p2, :cond_13

    .line 433
    .line 434
    return-void

    .line 435
    :cond_13
    aget-object p1, p1, v1

    .line 436
    .line 437
    throw v0

    .line 438
    :cond_14
    aget-object p1, p1, v1

    .line 439
    .line 440
    throw v0

    .line 441
    :pswitch_5
    sget-object v0, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 442
    .line 443
    if-ne p2, v0, :cond_1b

    .line 444
    .line 445
    invoke-interface {p1}, Landroidx/lifecycle/w;->x()LD/n;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-virtual {p1, p0}, LD/n;->g0(Landroidx/lifecycle/v;)V

    .line 450
    .line 451
    .line 452
    iget-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast p1, LN0/g;

    .line 455
    .line 456
    invoke-interface {p1}, LN0/g;->c()LN0/f;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    const-string v0, "androidx.savedstate.Restarter"

    .line 461
    .line 462
    invoke-virtual {p2, v0}, LN0/f;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 463
    .line 464
    .line 465
    move-result-object p2

    .line 466
    if-nez p2, :cond_15

    .line 467
    .line 468
    goto/16 :goto_7

    .line 469
    .line 470
    :cond_15
    const-string v0, "classes_to_restore"

    .line 471
    .line 472
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    if-eqz p2, :cond_1a

    .line 477
    .line 478
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    const/4 v1, 0x0

    .line 483
    move v2, v1

    .line 484
    :cond_16
    :goto_5
    if-ge v2, v0, :cond_19

    .line 485
    .line 486
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    add-int/lit8 v2, v2, 0x1

    .line 491
    .line 492
    check-cast v3, Ljava/lang/String;

    .line 493
    .line 494
    const-string v4, "Class "

    .line 495
    .line 496
    :try_start_0
    const-class v5, LN0/b;

    .line 497
    .line 498
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    invoke-static {v3, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    const-class v6, LN0/d;

    .line 507
    .line 508
    invoke-virtual {v5, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    const-string v6, "{\n                Class.\u2026class.java)\n            }"

    .line 513
    .line 514
    invoke-static {v5, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 515
    .line 516
    .line 517
    const/4 v6, 0x0

    .line 518
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 519
    .line 520
    .line 521
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 522
    const/4 v5, 0x1

    .line 523
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 524
    .line 525
    .line 526
    :try_start_2
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    const-string v5, "{\n                constr\u2026wInstance()\n            }"

    .line 531
    .line 532
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    check-cast v4, LN0/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 536
    .line 537
    instance-of v3, p1, Landroidx/lifecycle/k0;

    .line 538
    .line 539
    if-eqz v3, :cond_18

    .line 540
    .line 541
    move-object v3, p1

    .line 542
    check-cast v3, Landroidx/lifecycle/k0;

    .line 543
    .line 544
    invoke-interface {v3}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    invoke-interface {p1}, LN0/g;->c()LN0/f;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    new-instance v5, Ljava/util/HashSet;

    .line 556
    .line 557
    iget-object v3, v3, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 558
    .line 559
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eqz v6, :cond_17

    .line 575
    .line 576
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    check-cast v6, Ljava/lang/String;

    .line 581
    .line 582
    const-string v7, "key"

    .line 583
    .line 584
    invoke-static {v6, v7}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    check-cast v6, Landroidx/lifecycle/e0;

    .line 592
    .line 593
    invoke-static {v6}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    invoke-interface {p1}, Landroidx/lifecycle/w;->x()LD/n;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    invoke-static {v6, v4, v7}, Landroidx/lifecycle/Y;->a(Landroidx/lifecycle/e0;LN0/f;LD/n;)V

    .line 601
    .line 602
    .line 603
    goto :goto_6

    .line 604
    :cond_17
    new-instance v5, Ljava/util/HashSet;

    .line 605
    .line 606
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-nez v3, :cond_16

    .line 618
    .line 619
    invoke-virtual {v4}, LN0/f;->g()V

    .line 620
    .line 621
    .line 622
    goto/16 :goto_5

    .line 623
    .line 624
    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 625
    .line 626
    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 627
    .line 628
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw p1

    .line 632
    :catch_0
    move-exception p1

    .line 633
    new-instance p2, Ljava/lang/RuntimeException;

    .line 634
    .line 635
    const-string v0, "Failed to instantiate "

    .line 636
    .line 637
    invoke-static {v0, v3}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 642
    .line 643
    .line 644
    throw p2

    .line 645
    :catch_1
    move-exception p1

    .line 646
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 647
    .line 648
    new-instance v0, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 661
    .line 662
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 670
    .line 671
    .line 672
    throw p2

    .line 673
    :catch_2
    move-exception p1

    .line 674
    new-instance p2, Ljava/lang/RuntimeException;

    .line 675
    .line 676
    const-string v0, " wasn\'t found"

    .line 677
    .line 678
    invoke-static {v4, v3, v0}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 683
    .line 684
    .line 685
    throw p2

    .line 686
    :cond_19
    :goto_7
    return-void

    .line 687
    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 688
    .line 689
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 690
    .line 691
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    throw p1

    .line 695
    :cond_1b
    new-instance p1, Ljava/lang/AssertionError;

    .line 696
    .line 697
    const-string p2, "Next event must be ON_CREATE"

    .line 698
    .line 699
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    throw p1

    .line 703
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

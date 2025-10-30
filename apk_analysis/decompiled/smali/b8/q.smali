.class public final Lb8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO7/p;Lb8/f;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb8/q;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    check-cast p1, LG7/j;

    iput-object p1, p0, Lb8/q;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb8/q;->a:I

    iput-object p1, p0, Lb8/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb8/q;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/m;Lb8/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb8/q;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/q;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lb8/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Li7/H;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Li7/H;

    .line 12
    .line 13
    iget v1, v0, Li7/H;->s:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Li7/H;->s:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Li7/H;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Li7/H;-><init>(Lb8/q;LE7/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Li7/H;->r:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF7/a;->a:LF7/a;

    .line 33
    .line 34
    iget v2, v0, Li7/H;->s:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Lb0/b;

    .line 57
    .line 58
    iget-object p2, p0, Lb8/q;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Li7/K;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance p2, Li7/v;

    .line 66
    .line 67
    sget-object v2, Li7/t;->c:Lb0/g;

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lb0/b;->c(Lb0/g;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {p2, p1}, Li7/v;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput v3, v0, Li7/H;->s:I

    .line 79
    .line 80
    iget-object p1, p0, Lb8/q;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lb8/f;

    .line 83
    .line 84
    invoke-interface {p1, p2, v0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v1, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    :goto_1
    sget-object v1, LA7/n;->a:LA7/n;

    .line 92
    .line 93
    :goto_2
    return-object v1

    .line 94
    :pswitch_0
    instance-of v0, p2, Lb8/B;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    move-object v0, p2

    .line 99
    check-cast v0, Lb8/B;

    .line 100
    .line 101
    iget v1, v0, Lb8/B;->s:I

    .line 102
    .line 103
    const/high16 v2, -0x80000000

    .line 104
    .line 105
    and-int v3, v1, v2

    .line 106
    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    sub-int/2addr v1, v2

    .line 110
    iput v1, v0, Lb8/B;->s:I

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    new-instance v0, Lb8/B;

    .line 114
    .line 115
    invoke-direct {v0, p0, p2}, Lb8/B;-><init>(Lb8/q;LE7/d;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    iget-object p2, v0, Lb8/B;->r:Ljava/lang/Object;

    .line 119
    .line 120
    sget-object v1, LF7/a;->a:LF7/a;

    .line 121
    .line 122
    iget v2, v0, Lb8/B;->s:I

    .line 123
    .line 124
    const/4 v3, 0x2

    .line 125
    const/4 v4, 0x1

    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    if-eq v2, v4, :cond_6

    .line 129
    .line 130
    if-ne v2, v3, :cond_5

    .line 131
    .line 132
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 139
    .line 140
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_6
    iget-object p1, v0, Lb8/B;->v:Lb8/f;

    .line 145
    .line 146
    iget-object v2, v0, Lb8/B;->u:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput-object p1, v0, Lb8/B;->u:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p2, Lb8/f;

    .line 160
    .line 161
    iput-object p2, v0, Lb8/B;->v:Lb8/f;

    .line 162
    .line 163
    iput v4, v0, Lb8/B;->s:I

    .line 164
    .line 165
    iget-object v2, p0, Lb8/q;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, Lco/notix/le;

    .line 168
    .line 169
    invoke-interface {v2, p1, v0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-ne v2, v1, :cond_8

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    move-object v2, p1

    .line 177
    move-object p1, p2

    .line 178
    :goto_4
    const/4 p2, 0x0

    .line 179
    iput-object p2, v0, Lb8/B;->u:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p2, v0, Lb8/B;->v:Lb8/f;

    .line 182
    .line 183
    iput v3, v0, Lb8/B;->s:I

    .line 184
    .line 185
    invoke-interface {p1, v2, v0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-ne p1, v1, :cond_9

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_9
    :goto_5
    sget-object v1, LA7/n;->a:LA7/n;

    .line 193
    .line 194
    :goto_6
    return-object v1

    .line 195
    :pswitch_1
    instance-of v0, p2, Lb8/x;

    .line 196
    .line 197
    if-eqz v0, :cond_a

    .line 198
    .line 199
    move-object v0, p2

    .line 200
    check-cast v0, Lb8/x;

    .line 201
    .line 202
    iget v1, v0, Lb8/x;->t:I

    .line 203
    .line 204
    const/high16 v2, -0x80000000

    .line 205
    .line 206
    and-int v3, v1, v2

    .line 207
    .line 208
    if-eqz v3, :cond_a

    .line 209
    .line 210
    sub-int/2addr v1, v2

    .line 211
    iput v1, v0, Lb8/x;->t:I

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_a
    new-instance v0, Lb8/x;

    .line 215
    .line 216
    invoke-direct {v0, p0, p2}, Lb8/x;-><init>(Lb8/q;LE7/d;)V

    .line 217
    .line 218
    .line 219
    :goto_7
    iget-object p2, v0, Lb8/x;->s:Ljava/lang/Object;

    .line 220
    .line 221
    sget-object v1, LF7/a;->a:LF7/a;

    .line 222
    .line 223
    iget v2, v0, Lb8/x;->t:I

    .line 224
    .line 225
    const/4 v3, 0x1

    .line 226
    if-eqz v2, :cond_c

    .line 227
    .line 228
    if-ne v2, v3, :cond_b

    .line 229
    .line 230
    iget-object p1, v0, Lb8/x;->v:Ljava/lang/Object;

    .line 231
    .line 232
    iget-object v0, v0, Lb8/x;->r:Lb8/q;

    .line 233
    .line 234
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 239
    .line 240
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 241
    .line 242
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_c
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iput-object p0, v0, Lb8/x;->r:Lb8/q;

    .line 250
    .line 251
    iput-object p1, v0, Lb8/x;->v:Ljava/lang/Object;

    .line 252
    .line 253
    iput v3, v0, Lb8/x;->t:I

    .line 254
    .line 255
    iget-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p2, Lco/notix/lc;

    .line 258
    .line 259
    invoke-interface {p2, p1, v0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    if-ne p2, v1, :cond_d

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_d
    move-object v0, p0

    .line 267
    :goto_8
    check-cast p2, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-nez p2, :cond_e

    .line 274
    .line 275
    sget-object v1, LA7/n;->a:LA7/n;

    .line 276
    .line 277
    :goto_9
    return-object v1

    .line 278
    :cond_e
    iget-object p2, v0, Lb8/q;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p2, Lkotlin/jvm/internal/o;

    .line 281
    .line 282
    iput-object p1, p2, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 283
    .line 284
    new-instance p1, Lc8/a;

    .line 285
    .line 286
    invoke-direct {p1, v0}, Lc8/a;-><init>(Lb8/f;)V

    .line 287
    .line 288
    .line 289
    throw p1

    .line 290
    :pswitch_2
    instance-of v0, p2, Lb8/v;

    .line 291
    .line 292
    if-eqz v0, :cond_f

    .line 293
    .line 294
    move-object v0, p2

    .line 295
    check-cast v0, Lb8/v;

    .line 296
    .line 297
    iget v1, v0, Lb8/v;->t:I

    .line 298
    .line 299
    const/high16 v2, -0x80000000

    .line 300
    .line 301
    and-int v3, v1, v2

    .line 302
    .line 303
    if-eqz v3, :cond_f

    .line 304
    .line 305
    sub-int/2addr v1, v2

    .line 306
    iput v1, v0, Lb8/v;->t:I

    .line 307
    .line 308
    goto :goto_a

    .line 309
    :cond_f
    new-instance v0, Lb8/v;

    .line 310
    .line 311
    invoke-direct {v0, p0, p2}, Lb8/v;-><init>(Lb8/q;LE7/d;)V

    .line 312
    .line 313
    .line 314
    :goto_a
    iget-object p2, v0, Lb8/v;->s:Ljava/lang/Object;

    .line 315
    .line 316
    sget-object v1, LF7/a;->a:LF7/a;

    .line 317
    .line 318
    iget v2, v0, Lb8/v;->t:I

    .line 319
    .line 320
    const/4 v3, 0x2

    .line 321
    const/4 v4, 0x1

    .line 322
    if-eqz v2, :cond_12

    .line 323
    .line 324
    if-eq v2, v4, :cond_11

    .line 325
    .line 326
    if-ne v2, v3, :cond_10

    .line 327
    .line 328
    iget-object p1, v0, Lb8/v;->r:Lb8/q;

    .line 329
    .line 330
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 337
    .line 338
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw p1

    .line 342
    :cond_11
    iget-object p1, v0, Lb8/v;->v:Ljava/lang/Object;

    .line 343
    .line 344
    iget-object v2, v0, Lb8/v;->r:Lb8/q;

    .line 345
    .line 346
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    move-object v6, p2

    .line 350
    move-object p2, p1

    .line 351
    move-object p1, v2

    .line 352
    move-object v2, v6

    .line 353
    goto :goto_b

    .line 354
    :cond_12
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iput-object p0, v0, Lb8/v;->r:Lb8/q;

    .line 358
    .line 359
    iput-object p1, v0, Lb8/v;->v:Ljava/lang/Object;

    .line 360
    .line 361
    iput v4, v0, Lb8/v;->t:I

    .line 362
    .line 363
    iget-object p2, p0, Lb8/q;->c:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p2, LG7/j;

    .line 366
    .line 367
    invoke-interface {p2, p1, v0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p2

    .line 371
    if-ne p2, v1, :cond_13

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_13
    move-object v2, p2

    .line 375
    move-object p2, p1

    .line 376
    move-object p1, p0

    .line 377
    :goto_b
    check-cast v2, Ljava/lang/Boolean;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_14

    .line 384
    .line 385
    iget-object v2, p1, Lb8/q;->b:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v2, Lb8/f;

    .line 388
    .line 389
    iput-object p1, v0, Lb8/v;->r:Lb8/q;

    .line 390
    .line 391
    const/4 v5, 0x0

    .line 392
    iput-object v5, v0, Lb8/v;->v:Ljava/lang/Object;

    .line 393
    .line 394
    iput v3, v0, Lb8/v;->t:I

    .line 395
    .line 396
    invoke-interface {v2, p2, v0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    if-ne p2, v1, :cond_15

    .line 401
    .line 402
    goto :goto_d

    .line 403
    :cond_14
    const/4 v4, 0x0

    .line 404
    :cond_15
    :goto_c
    if-eqz v4, :cond_16

    .line 405
    .line 406
    sget-object v1, LA7/n;->a:LA7/n;

    .line 407
    .line 408
    :goto_d
    return-object v1

    .line 409
    :cond_16
    new-instance p2, Lc8/a;

    .line 410
    .line 411
    invoke-direct {p2, p1}, Lc8/a;-><init>(Lb8/f;)V

    .line 412
    .line 413
    .line 414
    throw p2

    .line 415
    :pswitch_3
    instance-of v0, p2, Lb8/r;

    .line 416
    .line 417
    if-eqz v0, :cond_17

    .line 418
    .line 419
    move-object v0, p2

    .line 420
    check-cast v0, Lb8/r;

    .line 421
    .line 422
    iget v1, v0, Lb8/r;->t:I

    .line 423
    .line 424
    const/high16 v2, -0x80000000

    .line 425
    .line 426
    and-int v3, v1, v2

    .line 427
    .line 428
    if-eqz v3, :cond_17

    .line 429
    .line 430
    sub-int/2addr v1, v2

    .line 431
    iput v1, v0, Lb8/r;->t:I

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_17
    new-instance v0, Lb8/r;

    .line 435
    .line 436
    invoke-direct {v0, p0, p2}, Lb8/r;-><init>(Lb8/q;LE7/d;)V

    .line 437
    .line 438
    .line 439
    :goto_e
    iget-object p2, v0, Lb8/r;->r:Ljava/lang/Object;

    .line 440
    .line 441
    sget-object v1, LF7/a;->a:LF7/a;

    .line 442
    .line 443
    iget v2, v0, Lb8/r;->t:I

    .line 444
    .line 445
    sget-object v3, LA7/n;->a:LA7/n;

    .line 446
    .line 447
    const/4 v4, 0x1

    .line 448
    if-eqz v2, :cond_1a

    .line 449
    .line 450
    if-ne v2, v4, :cond_19

    .line 451
    .line 452
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_18
    :goto_f
    move-object v1, v3

    .line 456
    goto :goto_10

    .line 457
    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 458
    .line 459
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 460
    .line 461
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw p1

    .line 465
    :cond_1a
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    iget-object p2, p0, Lb8/q;->c:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast p2, Lkotlin/jvm/internal/m;

    .line 471
    .line 472
    iget v2, p2, Lkotlin/jvm/internal/m;->a:I

    .line 473
    .line 474
    if-lt v2, v4, :cond_1b

    .line 475
    .line 476
    iput v4, v0, Lb8/r;->t:I

    .line 477
    .line 478
    iget-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast p2, Lb8/f;

    .line 481
    .line 482
    invoke-interface {p2, p1, v0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    if-ne p1, v1, :cond_18

    .line 487
    .line 488
    goto :goto_10

    .line 489
    :cond_1b
    add-int/2addr v2, v4

    .line 490
    iput v2, p2, Lkotlin/jvm/internal/m;->a:I

    .line 491
    .line 492
    goto :goto_f

    .line 493
    :goto_10
    return-object v1

    .line 494
    :pswitch_4
    instance-of v0, p2, Lb8/p;

    .line 495
    .line 496
    if-eqz v0, :cond_1c

    .line 497
    .line 498
    move-object v0, p2

    .line 499
    check-cast v0, Lb8/p;

    .line 500
    .line 501
    iget v1, v0, Lb8/p;->u:I

    .line 502
    .line 503
    const/high16 v2, -0x80000000

    .line 504
    .line 505
    and-int v3, v1, v2

    .line 506
    .line 507
    if-eqz v3, :cond_1c

    .line 508
    .line 509
    sub-int/2addr v1, v2

    .line 510
    iput v1, v0, Lb8/p;->u:I

    .line 511
    .line 512
    goto :goto_11

    .line 513
    :cond_1c
    new-instance v0, Lb8/p;

    .line 514
    .line 515
    invoke-direct {v0, p0, p2}, Lb8/p;-><init>(Lb8/q;LE7/d;)V

    .line 516
    .line 517
    .line 518
    :goto_11
    iget-object p2, v0, Lb8/p;->s:Ljava/lang/Object;

    .line 519
    .line 520
    sget-object v1, LF7/a;->a:LF7/a;

    .line 521
    .line 522
    iget v2, v0, Lb8/p;->u:I

    .line 523
    .line 524
    const/4 v3, 0x1

    .line 525
    if-eqz v2, :cond_1e

    .line 526
    .line 527
    if-ne v2, v3, :cond_1d

    .line 528
    .line 529
    iget-object p1, v0, Lb8/p;->r:Lb8/q;

    .line 530
    .line 531
    :try_start_0
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 532
    .line 533
    .line 534
    goto :goto_12

    .line 535
    :catchall_0
    move-exception p2

    .line 536
    goto :goto_15

    .line 537
    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 538
    .line 539
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 540
    .line 541
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw p1

    .line 545
    :cond_1e
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :try_start_1
    iget-object p2, p0, Lb8/q;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p2, Lb8/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 551
    .line 552
    :try_start_2
    iput-object p0, v0, Lb8/p;->r:Lb8/q;

    .line 553
    .line 554
    iput v3, v0, Lb8/p;->u:I

    .line 555
    .line 556
    invoke-interface {p2, p1, v0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 560
    if-ne p1, v1, :cond_1f

    .line 561
    .line 562
    goto :goto_13

    .line 563
    :cond_1f
    :goto_12
    sget-object v1, LA7/n;->a:LA7/n;

    .line 564
    .line 565
    :goto_13
    return-object v1

    .line 566
    :catchall_1
    move-exception p2

    .line 567
    :goto_14
    move-object p1, p0

    .line 568
    goto :goto_15

    .line 569
    :catchall_2
    move-exception p1

    .line 570
    move-object p2, p1

    .line 571
    goto :goto_14

    .line 572
    :goto_15
    iget-object p1, p1, Lb8/q;->c:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast p1, Lkotlin/jvm/internal/o;

    .line 575
    .line 576
    iput-object p2, p1, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 577
    .line 578
    throw p2

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.class public final synthetic Lg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/player/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/player/PlayerActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg2/d;->a:I

    iput-object p1, p0, Lg2/d;->b:Lcom/anilab/android/ui/player/PlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    sget-object v1, LA7/n;->a:LA7/n;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lg2/d;->b:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 6
    .line 7
    iget v4, p0, Lg2/d;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 13
    .line 14
    new-instance v0, Lg2/m;

    .line 15
    .line 16
    invoke-direct {v0, v3}, Lg2/m;-><init>(Lcom/anilab/android/ui/player/PlayerActivity;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 21
    .line 22
    new-instance v0, Lg2/c0;

    .line 23
    .line 24
    new-instance v1, Lg2/f;

    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-direct {v1, v3, v2}, Lg2/f;-><init>(Lcom/anilab/android/ui/player/PlayerActivity;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lg2/c0;-><init>(Lg2/f;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_1
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 36
    .line 37
    new-instance v0, Landroid/widget/ArrayAdapter;

    .line 38
    .line 39
    const v1, 0x7f0d0083

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v3, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 47
    .line 48
    new-instance v0, Lg2/b;

    .line 49
    .line 50
    new-instance v1, Lg2/f;

    .line 51
    .line 52
    const/4 v2, 0x7

    .line 53
    invoke-direct {v1, v3, v2}, Lg2/f;-><init>(Lcom/anilab/android/ui/player/PlayerActivity;I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, Lg2/b;-><init>(LO7/l;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_3
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 61
    .line 62
    new-instance v0, Lg2/b;

    .line 63
    .line 64
    new-instance v1, Lg2/f;

    .line 65
    .line 66
    const/4 v2, 0x6

    .line 67
    invoke-direct {v1, v3, v2}, Lg2/f;-><init>(Lcom/anilab/android/ui/player/PlayerActivity;I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1}, Lg2/b;-><init>(LO7/l;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_4
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->Z()Lj3/r0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, LD/n;

    .line 81
    .line 82
    invoke-interface {v0, v2}, Lj3/r0;->f(Z)V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :pswitch_5
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 87
    .line 88
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->Z()Lj3/r0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, LD/n;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Lj3/r0;->f(Z)V

    .line 95
    .line 96
    .line 97
    return-object v1

    .line 98
    :pswitch_6
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 99
    .line 100
    const-string v0, "audio"

    .line 101
    .line 102
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    check-cast v0, Landroid/media/AudioManager;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_7
    new-instance v1, Lk4/E;

    .line 115
    .line 116
    iget-object v4, v3, Lcom/anilab/android/ui/player/PlayerActivity;->i0:LA7/l;

    .line 117
    .line 118
    invoke-virtual {v4}, LA7/l;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Li8/E;

    .line 123
    .line 124
    invoke-direct {v1, v4}, Lk4/E;-><init>(Li8/E;)V

    .line 125
    .line 126
    .line 127
    new-instance v4, Le1/q;

    .line 128
    .line 129
    invoke-direct {v4, v0}, Le1/q;-><init>(I)V

    .line 130
    .line 131
    .line 132
    new-instance v5, Lj3/p;

    .line 133
    .line 134
    invoke-direct {v5, v3}, Lj3/p;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    new-instance v6, LN3/m;

    .line 138
    .line 139
    new-instance v7, Lq3/h;

    .line 140
    .line 141
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-direct {v6, v1, v7}, LN3/m;-><init>(Lk4/l;Lq3/h;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v4}, LN3/m;->d(Le1/q;)V

    .line 148
    .line 149
    .line 150
    iget-boolean v1, v5, Lj3/p;->r:Z

    .line 151
    .line 152
    xor-int/2addr v1, v2

    .line 153
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 154
    .line 155
    .line 156
    new-instance v1, LN3/l;

    .line 157
    .line 158
    invoke-direct {v1, v0, v6}, LN3/l;-><init>(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iput-object v1, v5, Lj3/p;->d:LO5/n;

    .line 162
    .line 163
    new-instance v0, LS2/a;

    .line 164
    .line 165
    invoke-direct {v0, v3}, Lj3/k;-><init>(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    iget-boolean v1, v5, Lj3/p;->r:Z

    .line 169
    .line 170
    xor-int/2addr v1, v2

    .line 171
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 172
    .line 173
    .line 174
    new-instance v1, LN3/l;

    .line 175
    .line 176
    invoke-direct {v1, v2, v0}, LN3/l;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iput-object v1, v5, Lj3/p;->c:LO5/n;

    .line 180
    .line 181
    iget-boolean v0, v5, Lj3/p;->r:Z

    .line 182
    .line 183
    xor-int/2addr v0, v2

    .line 184
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 185
    .line 186
    .line 187
    const-wide/16 v0, 0x2710

    .line 188
    .line 189
    iput-wide v0, v5, Lj3/p;->m:J

    .line 190
    .line 191
    iget-boolean v3, v5, Lj3/p;->r:Z

    .line 192
    .line 193
    xor-int/2addr v3, v2

    .line 194
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 195
    .line 196
    .line 197
    iput-wide v0, v5, Lj3/p;->l:J

    .line 198
    .line 199
    iget-boolean v0, v5, Lj3/p;->r:Z

    .line 200
    .line 201
    xor-int/2addr v0, v2

    .line 202
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 203
    .line 204
    .line 205
    iput-boolean v2, v5, Lj3/p;->r:Z

    .line 206
    .line 207
    new-instance v0, Lj3/D;

    .line 208
    .line 209
    invoke-direct {v0, v5}, Lj3/D;-><init>(Lj3/p;)V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_8
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 214
    .line 215
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_9
    sget v1, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 220
    .line 221
    new-instance v1, Ld0/w;

    .line 222
    .line 223
    invoke-direct {v1, v0}, Ld0/w;-><init>(I)V

    .line 224
    .line 225
    .line 226
    new-instance v0, Li8/D;

    .line 227
    .line 228
    invoke-direct {v0}, Li8/D;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v1}, Li8/D;->d(Li8/s;)V

    .line 232
    .line 233
    .line 234
    new-instance v1, LB2/l;

    .line 235
    .line 236
    invoke-direct {v1, v2, v3}, LB2/l;-><init>(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v1}, Li8/D;->a(Li8/z;)V

    .line 240
    .line 241
    .line 242
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 243
    .line 244
    const-wide/16 v1, 0x1e

    .line 245
    .line 246
    invoke-virtual {v0, v1, v2}, Li8/D;->b(J)V

    .line 247
    .line 248
    .line 249
    new-instance v1, Li8/E;

    .line 250
    .line 251
    invoke-direct {v1, v0}, Li8/E;-><init>(Li8/D;)V

    .line 252
    .line 253
    .line 254
    return-object v1

    .line 255
    :pswitch_a
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 256
    .line 257
    new-instance v0, Lo3/e;

    .line 258
    .line 259
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->X()Lu4/b;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    new-instance v2, LQ6/f;

    .line 264
    .line 265
    const/16 v3, 0xc

    .line 266
    .line 267
    invoke-direct {v2, v3}, LQ6/f;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-direct {v0, v1, v2}, Lo3/e;-><init>(Lu4/b;LQ6/f;)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_b
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 275
    .line 276
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, Lu4/b;->a(Landroid/content/Context;)Lu4/b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    return-object v0

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
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
.end method

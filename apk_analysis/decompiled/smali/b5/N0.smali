.class public final Lb5/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lb5/S0;


# direct methods
.method public synthetic constructor <init>(Lb5/S0;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lb5/N0;->a:I

    iput-wide p2, p0, Lb5/N0;->b:J

    iput-object p1, p0, Lb5/N0;->c:Lb5/S0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lb5/N0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/N0;->c:Lb5/S0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lb5/B;->m0()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lb5/n0;

    .line 17
    .line 18
    iget-object v2, v1, Lb5/n0;->i:Lb5/V;

    .line 19
    .line 20
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "Resetting analytics data (FE)"

    .line 24
    .line 25
    iget-object v2, v2, Lb5/V;->m:Lb5/T;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lb5/n0;->k:Lb5/t1;

    .line 31
    .line 32
    invoke-static {v2}, Lb5/n0;->e(Lb5/B;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lb5/A;->l0()V

    .line 36
    .line 37
    .line 38
    iget-object v3, v2, Lb5/t1;->f:LN3/X;

    .line 39
    .line 40
    iget-object v4, v3, LN3/X;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lb5/s1;

    .line 43
    .line 44
    invoke-virtual {v4}, Lb5/o;->a()V

    .line 45
    .line 46
    .line 47
    iget-object v4, v3, LN3/X;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Lb5/t1;

    .line 50
    .line 51
    iget-object v4, v4, LD/n;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lb5/n0;

    .line 54
    .line 55
    iget-object v5, v4, Lb5/n0;->g:Lb5/g;

    .line 56
    .line 57
    sget-object v6, Lb5/E;->c1:Lb5/D;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-virtual {v5, v7, v6}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const-wide/16 v8, 0x0

    .line 65
    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    iget-object v4, v4, Lb5/n0;->n:LK4/a;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    iput-wide v4, v3, LN3/X;->a:J

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iput-wide v8, v3, LN3/X;->a:J

    .line 81
    .line 82
    move-wide v4, v8

    .line 83
    :goto_0
    iput-wide v4, v3, LN3/X;->b:J

    .line 84
    .line 85
    invoke-virtual {v1}, Lb5/n0;->i()Lb5/L;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lb5/L;->t0()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lb5/n0;->a()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    xor-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    iget-object v4, v1, Lb5/n0;->h:Lb5/e0;

    .line 99
    .line 100
    invoke-static {v4}, Lb5/n0;->d(LD/n;)V

    .line 101
    .line 102
    .line 103
    iget-object v5, v4, Lb5/e0;->g:Lb5/c0;

    .line 104
    .line 105
    iget-wide v10, p0, Lb5/N0;->b:J

    .line 106
    .line 107
    invoke-virtual {v5, v10, v11}, Lb5/c0;->g(J)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v4, LD/n;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Lb5/n0;

    .line 113
    .line 114
    iget-object v6, v5, Lb5/n0;->h:Lb5/e0;

    .line 115
    .line 116
    invoke-static {v6}, Lb5/n0;->d(LD/n;)V

    .line 117
    .line 118
    .line 119
    iget-object v6, v6, Lb5/e0;->w:LA6/t;

    .line 120
    .line 121
    invoke-virtual {v6}, LA6/t;->m()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_1

    .line 130
    .line 131
    iget-object v6, v4, Lb5/e0;->w:LA6/t;

    .line 132
    .line 133
    invoke-virtual {v6, v7}, LA6/t;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    iget-object v6, v4, Lb5/e0;->q:Lb5/c0;

    .line 137
    .line 138
    invoke-virtual {v6, v8, v9}, Lb5/c0;->g(J)V

    .line 139
    .line 140
    .line 141
    iget-object v6, v4, Lb5/e0;->r:Lb5/c0;

    .line 142
    .line 143
    invoke-virtual {v6, v8, v9}, Lb5/c0;->g(J)V

    .line 144
    .line 145
    .line 146
    iget-object v5, v5, Lb5/n0;->g:Lb5/g;

    .line 147
    .line 148
    invoke-virtual {v5}, Lb5/g;->m0()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-nez v5, :cond_2

    .line 153
    .line 154
    invoke-virtual {v4, v3}, Lb5/e0;->t0(Z)V

    .line 155
    .line 156
    .line 157
    :cond_2
    iget-object v5, v4, Lb5/e0;->x:LA6/t;

    .line 158
    .line 159
    invoke-virtual {v5, v7}, LA6/t;->n(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v5, v4, Lb5/e0;->y:Lb5/c0;

    .line 163
    .line 164
    invoke-virtual {v5, v8, v9}, Lb5/c0;->g(J)V

    .line 165
    .line 166
    .line 167
    iget-object v4, v4, Lb5/e0;->z:Lcom/google/firebase/messaging/s;

    .line 168
    .line 169
    invoke-virtual {v4, v7}, Lcom/google/firebase/messaging/s;->A(Landroid/os/Bundle;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Lb5/n0;->m()Lb5/m1;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v4}, Lb5/A;->l0()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Lb5/B;->m0()V

    .line 180
    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    invoke-virtual {v4, v5}, Lb5/m1;->z0(Z)Lb5/Q1;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v4}, Lb5/m1;->D0()V

    .line 188
    .line 189
    .line 190
    iget-object v6, v4, LD/n;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v6, Lb5/n0;

    .line 193
    .line 194
    invoke-virtual {v6}, Lb5/n0;->j()Lb5/N;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Lb5/N;->q0()V

    .line 199
    .line 200
    .line 201
    new-instance v6, Lb5/i1;

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-direct {v6, v4, v5, v7}, Lb5/i1;-><init>(Lb5/m1;Lb5/Q1;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v6}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, Lb5/n0;->e(Lb5/B;)V

    .line 211
    .line 212
    .line 213
    iget-object v2, v2, Lb5/t1;->e:Lo1/f;

    .line 214
    .line 215
    invoke-virtual {v2}, Lo1/f;->L()V

    .line 216
    .line 217
    .line 218
    iput-boolean v3, v0, Lb5/S0;->s:Z

    .line 219
    .line 220
    invoke-virtual {v1}, Lb5/n0;->m()Lb5/m1;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 225
    .line 226
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, Lb5/m1;->r0(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_0
    iget-object v0, p0, Lb5/N0;->c:Lb5/S0;

    .line 234
    .line 235
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Lb5/n0;

    .line 238
    .line 239
    iget-object v1, v0, Lb5/n0;->h:Lb5/e0;

    .line 240
    .line 241
    invoke-static {v1}, Lb5/n0;->d(LD/n;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, Lb5/e0;->l:Lb5/c0;

    .line 245
    .line 246
    iget-wide v2, p0, Lb5/N0;->b:J

    .line 247
    .line 248
    invoke-virtual {v1, v2, v3}, Lb5/c0;->g(J)V

    .line 249
    .line 250
    .line 251
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 252
    .line 253
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iget-object v0, v0, Lb5/V;->m:Lb5/T;

    .line 261
    .line 262
    const-string v2, "Session timeout duration set"

    .line 263
    .line 264
    invoke-virtual {v0, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

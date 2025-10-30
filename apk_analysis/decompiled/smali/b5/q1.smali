.class public final Lb5/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lb5/t1;


# direct methods
.method public synthetic constructor <init>(Lb5/t1;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lb5/q1;->a:I

    iput-wide p2, p0, Lb5/q1;->b:J

    iput-object p1, p0, Lb5/q1;->c:Lb5/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lb5/q1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/q1;->c:Lb5/t1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lb5/t1;->p0()V

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
    iget-wide v7, p0, Lb5/q1;->b:J

    .line 24
    .line 25
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v2, v2, Lb5/V;->n:Lb5/T;

    .line 30
    .line 31
    const-string v4, "Activity paused, time"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lb5/r1;

    .line 37
    .line 38
    iget-object v4, v0, Lb5/t1;->g:LO0/c;

    .line 39
    .line 40
    iget-object v2, v4, LO0/c;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lb5/t1;

    .line 43
    .line 44
    iget-object v5, v2, LD/n;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Lb5/n0;

    .line 47
    .line 48
    iget-object v5, v5, Lb5/n0;->n:LK4/a;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-direct/range {v3 .. v8}, Lb5/r1;-><init>(LO0/c;JJ)V

    .line 58
    .line 59
    .line 60
    iput-object v3, v4, LO0/c;->b:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v2, v2, Lb5/t1;->c:LT4/d;

    .line 63
    .line 64
    const-wide/16 v4, 0x7d0

    .line 65
    .line 66
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    iget-object v1, v1, Lb5/n0;->g:Lb5/g;

    .line 70
    .line 71
    invoke-virtual {v1}, Lb5/g;->z0()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v0, v0, Lb5/t1;->f:LN3/X;

    .line 78
    .line 79
    iget-object v0, v0, LN3/X;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lb5/s1;

    .line 82
    .line 83
    invoke-virtual {v0}, Lb5/o;->a()V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void

    .line 87
    :pswitch_0
    iget-object v0, p0, Lb5/q1;->c:Lb5/t1;

    .line 88
    .line 89
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lb5/t1;->p0()V

    .line 93
    .line 94
    .line 95
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lb5/n0;

    .line 98
    .line 99
    iget-object v2, v1, Lb5/n0;->i:Lb5/V;

    .line 100
    .line 101
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 102
    .line 103
    .line 104
    iget-wide v3, p0, Lb5/q1;->b:J

    .line 105
    .line 106
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    iget-object v2, v2, Lb5/V;->n:Lb5/T;

    .line 111
    .line 112
    const-string v6, "Activity resumed, time"

    .line 113
    .line 114
    invoke-virtual {v2, v5, v6}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    sget-object v2, Lb5/E;->b1:Lb5/D;

    .line 118
    .line 119
    iget-object v5, v1, Lb5/n0;->g:Lb5/g;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-virtual {v5, v6, v2}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    iget-object v7, v0, Lb5/t1;->f:LN3/X;

    .line 127
    .line 128
    if-eqz v2, :cond_2

    .line 129
    .line 130
    invoke-virtual {v5}, Lb5/g;->z0()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_1

    .line 135
    .line 136
    iget-boolean v1, v0, Lb5/t1;->d:Z

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    :cond_1
    iget-object v1, v7, LN3/X;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lb5/t1;

    .line 143
    .line 144
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 145
    .line 146
    .line 147
    iget-object v1, v7, LN3/X;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Lb5/s1;

    .line 150
    .line 151
    invoke-virtual {v1}, Lb5/o;->a()V

    .line 152
    .line 153
    .line 154
    iput-wide v3, v7, LN3/X;->a:J

    .line 155
    .line 156
    iput-wide v3, v7, LN3/X;->b:J

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_2
    invoke-virtual {v5}, Lb5/g;->z0()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-nez v2, :cond_3

    .line 164
    .line 165
    iget-object v1, v1, Lb5/n0;->h:Lb5/e0;

    .line 166
    .line 167
    invoke-static {v1}, Lb5/n0;->d(LD/n;)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v1, Lb5/e0;->t:Lb5/b0;

    .line 171
    .line 172
    invoke-virtual {v1}, Lb5/b0;->b()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_4

    .line 177
    .line 178
    :cond_3
    iget-object v1, v7, LN3/X;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Lb5/t1;

    .line 181
    .line 182
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 183
    .line 184
    .line 185
    iget-object v1, v7, LN3/X;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v1, Lb5/s1;

    .line 188
    .line 189
    invoke-virtual {v1}, Lb5/o;->a()V

    .line 190
    .line 191
    .line 192
    iput-wide v3, v7, LN3/X;->a:J

    .line 193
    .line 194
    iput-wide v3, v7, LN3/X;->b:J

    .line 195
    .line 196
    :cond_4
    :goto_0
    iget-object v1, v0, Lb5/t1;->g:LO0/c;

    .line 197
    .line 198
    iget-object v2, v1, LO0/c;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, Lb5/t1;

    .line 201
    .line 202
    invoke-virtual {v2}, Lb5/A;->l0()V

    .line 203
    .line 204
    .line 205
    iget-object v1, v1, LO0/c;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Lb5/r1;

    .line 208
    .line 209
    if-eqz v1, :cond_5

    .line 210
    .line 211
    iget-object v3, v2, Lb5/t1;->c:LT4/d;

    .line 212
    .line 213
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    :cond_5
    iget-object v1, v2, LD/n;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, Lb5/n0;

    .line 219
    .line 220
    iget-object v3, v1, Lb5/n0;->h:Lb5/e0;

    .line 221
    .line 222
    invoke-static {v3}, Lb5/n0;->d(LD/n;)V

    .line 223
    .line 224
    .line 225
    iget-object v3, v3, Lb5/e0;->t:Lb5/b0;

    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-virtual {v3, v4}, Lb5/b0;->a(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lb5/A;->l0()V

    .line 232
    .line 233
    .line 234
    iput-boolean v4, v2, Lb5/t1;->d:Z

    .line 235
    .line 236
    sget-object v2, Lb5/E;->a1:Lb5/D;

    .line 237
    .line 238
    iget-object v3, v1, Lb5/n0;->g:Lb5/g;

    .line 239
    .line 240
    invoke-virtual {v3, v6, v2}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_6

    .line 245
    .line 246
    iget-object v2, v1, Lb5/n0;->p:Lb5/S0;

    .line 247
    .line 248
    invoke-static {v2}, Lb5/n0;->e(Lb5/B;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v3, v2, Lb5/S0;->n:Z

    .line 252
    .line 253
    if-eqz v3, :cond_6

    .line 254
    .line 255
    iget-object v1, v1, Lb5/n0;->i:Lb5/V;

    .line 256
    .line 257
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 258
    .line 259
    .line 260
    const-string v3, "Retrying trigger URI registration in foreground"

    .line 261
    .line 262
    iget-object v1, v1, Lb5/V;->n:Lb5/T;

    .line 263
    .line 264
    invoke-virtual {v1, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2}, Lb5/n0;->e(Lb5/B;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Lb5/S0;->z0()V

    .line 271
    .line 272
    .line 273
    :cond_6
    iget-object v0, v0, Lb5/t1;->e:Lo1/f;

    .line 274
    .line 275
    iget-object v1, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Lb5/t1;

    .line 278
    .line 279
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 280
    .line 281
    .line 282
    iget-object v1, v1, LD/n;->a:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Lb5/n0;

    .line 285
    .line 286
    invoke-virtual {v1}, Lb5/n0;->a()Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-nez v2, :cond_7

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_7
    iget-object v1, v1, Lb5/n0;->n:LK4/a;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 299
    .line 300
    .line 301
    move-result-wide v1

    .line 302
    invoke-virtual {v0, v1, v2}, Lo1/f;->N(J)V

    .line 303
    .line 304
    .line 305
    :goto_1
    return-void

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

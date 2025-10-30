.class public final LC0/b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/b;->d:I

    iput-object p2, p0, LC0/b;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "it"

    .line 3
    .line 4
    iget v2, p0, LC0/b;->d:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lu0/m;

    .line 10
    .line 11
    const-string v0, "entry"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lw0/i;

    .line 17
    .line 18
    iget-object v1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lw0/f;

    .line 21
    .line 22
    invoke-direct {v0, v1, p1}, Lw0/i;-><init>(Lw0/f;Lu0/m;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/io/IOException;

    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lk8/c;->a:[B

    .line 32
    .line 33
    iget-object p1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ll8/g;

    .line 36
    .line 37
    iput-boolean v0, p1, Ll8/g;->i:Z

    .line 38
    .line 39
    sget-object p1, LA7/n;->a:LA7/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 43
    .line 44
    iget-object p1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lg8/i;

    .line 47
    .line 48
    invoke-virtual {p1}, Lg8/i;->e()V

    .line 49
    .line 50
    .line 51
    sget-object p1, LA7/n;->a:LA7/n;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 55
    .line 56
    iget-object p1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, LS5/p;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 62
    .line 63
    .line 64
    sget-object p1, LA7/n;->a:LA7/n;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 68
    .line 69
    iget-object v1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Le1/l;

    .line 72
    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    iget-object p1, v1, Le1/l;->a:Lp1/j;

    .line 76
    .line 77
    invoke-virtual {p1}, Lp1/h;->isDone()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    const-string v0, "Failed requirement."

    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_1
    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    .line 93
    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    iget-object p1, v1, Le1/l;->a:Lp1/j;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lp1/h;->cancel(Z)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    iget-object v0, v1, Le1/l;->a:Lp1/j;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    move-object p1, v1

    .line 112
    :goto_0
    invoke-virtual {v0, p1}, Lp1/j;->k(Ljava/lang/Throwable;)Z

    .line 113
    .line 114
    .line 115
    :goto_1
    sget-object p1, LA7/n;->a:LA7/n;

    .line 116
    .line 117
    return-object p1

    .line 118
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 119
    .line 120
    iget-object v0, p0, LC0/b;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LX/O;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    iget-object v1, v0, LX/O;->h:LG0/s;

    .line 127
    .line 128
    new-instance v2, LX/P;

    .line 129
    .line 130
    invoke-direct {v2, p1}, LX/P;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, LG0/s;->c(LX/Z;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    iget-object p1, v0, LX/O;->j:LA7/l;

    .line 137
    .line 138
    iget-object p1, p1, LA7/l;->b:Ljava/lang/Object;

    .line 139
    .line 140
    sget-object v1, LA7/m;->a:LA7/m;

    .line 141
    .line 142
    if-eq p1, v1, :cond_5

    .line 143
    .line 144
    iget-object p1, v0, LX/O;->j:LA7/l;

    .line 145
    .line 146
    invoke-virtual {p1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, LZ/i;

    .line 151
    .line 152
    invoke-virtual {p1}, LZ/i;->close()V

    .line 153
    .line 154
    .line 155
    :cond_5
    sget-object p1, LA7/n;->a:LA7/n;

    .line 156
    .line 157
    return-object p1

    .line 158
    :pswitch_5
    check-cast p1, Landroid/content/Context;

    .line 159
    .line 160
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, LC0/d;

    .line 164
    .line 165
    const-string v0, "context"

    .line 166
    .line 167
    iget-object v1, p0, LC0/b;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Landroid/content/Context;

    .line 170
    .line 171
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, LC0/c;->b(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v1, "get(context)"

    .line 179
    .line 180
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-direct {p1, v0}, LC0/g;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

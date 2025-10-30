.class public final LX/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/e;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO7/p;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LX/t;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, LG7/j;

    iput-object p1, p0, LX/t;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lb8/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LX/t;->a:I

    iput-object p1, p0, LX/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lb8/f;LE7/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LX/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lb8/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lb8/a;

    .line 12
    .line 13
    iget v1, v0, Lb8/a;->u:I

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
    iput v1, v0, Lb8/a;->u:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lb8/a;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lb8/a;-><init>(LX/t;LE7/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lb8/a;->s:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF7/a;->a:LF7/a;

    .line 33
    .line 34
    iget v2, v0, Lb8/a;->u:I

    .line 35
    .line 36
    sget-object v3, LA7/n;->a:LA7/n;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lb8/a;->r:Lc8/z;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception p2

    .line 50
    goto :goto_5

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Lc8/z;

    .line 63
    .line 64
    invoke-interface {v0}, LE7/d;->getContext()LE7/i;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {p2, p1, v2}, Lc8/z;-><init>(Lb8/f;LE7/i;)V

    .line 69
    .line 70
    .line 71
    :try_start_1
    iput-object p2, v0, Lb8/a;->r:Lc8/z;

    .line 72
    .line 73
    iput v4, v0, Lb8/a;->u:I

    .line 74
    .line 75
    iget-object p1, p0, LX/t;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, LG7/j;

    .line 78
    .line 79
    invoke-interface {p1, p2, v0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    if-ne p1, v1, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object p1, v3

    .line 87
    :goto_1
    if-ne p1, v1, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move-object p1, p2

    .line 91
    :goto_2
    invoke-virtual {p1}, LG7/c;->releaseIntercepted()V

    .line 92
    .line 93
    .line 94
    move-object v1, v3

    .line 95
    :goto_3
    return-object v1

    .line 96
    :goto_4
    move-object v5, p2

    .line 97
    move-object p2, p1

    .line 98
    move-object p1, v5

    .line 99
    goto :goto_5

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    goto :goto_4

    .line 102
    :goto_5
    invoke-virtual {p1}, LG7/c;->releaseIntercepted()V

    .line 103
    .line 104
    .line 105
    throw p2

    .line 106
    :pswitch_0
    new-instance v0, LX/s;

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    invoke-direct {v0, p1, v1}, LX/s;-><init>(Lb8/f;I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, LX/t;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Lco/notix/b9;

    .line 115
    .line 116
    invoke-interface {p1, v0, p2}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget-object p2, LF7/a;->a:LF7/a;

    .line 121
    .line 122
    if-ne p1, p2, :cond_5

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_5
    sget-object p1, LA7/n;->a:LA7/n;

    .line 126
    .line 127
    :goto_6
    return-object p1

    .line 128
    :pswitch_1
    new-instance v0, Lkotlin/jvm/internal/m;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v1, Lb8/q;

    .line 134
    .line 135
    invoke-direct {v1, v0, p1}, Lb8/q;-><init>(Lkotlin/jvm/internal/m;Lb8/f;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, LX/t;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, Lb8/e;

    .line 141
    .line 142
    invoke-interface {p1, v1, p2}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    sget-object p2, LF7/a;->a:LF7/a;

    .line 147
    .line 148
    if-ne p1, p2, :cond_6

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_6
    sget-object p1, LA7/n;->a:LA7/n;

    .line 152
    .line 153
    :goto_7
    return-object p1

    .line 154
    :pswitch_2
    new-instance v0, LX/s;

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    invoke-direct {v0, p1, v1}, LX/s;-><init>(Lb8/f;I)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, LX/t;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Lb8/s;

    .line 163
    .line 164
    invoke-virtual {p1, v0, p2}, Lb8/s;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    sget-object p2, LF7/a;->a:LF7/a;

    .line 169
    .line 170
    if-ne p1, p2, :cond_7

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_7
    sget-object p1, LA7/n;->a:LA7/n;

    .line 174
    .line 175
    :goto_8
    return-object p1

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

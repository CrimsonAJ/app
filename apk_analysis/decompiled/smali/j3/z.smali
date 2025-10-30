.class public final synthetic Lj3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm4/v;


# direct methods
.method public synthetic constructor <init>(Lk3/a;Lm4/v;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, Lj3/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj3/z;->b:Lm4/v;

    return-void
.end method

.method public synthetic constructor <init>(Lm4/v;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lj3/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/z;->b:Lm4/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lj3/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lk3/j;

    .line 7
    .line 8
    iget-object v0, p1, Lk3/j;->o:LA3/E;

    .line 9
    .line 10
    iget-object v1, p0, Lj3/z;->b:Lm4/v;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LA3/E;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lj3/M;

    .line 17
    .line 18
    iget v3, v2, Lj3/M;->r:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Lj3/M;->a()Lj3/L;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v3, v1, Lm4/v;->a:I

    .line 28
    .line 29
    iput v3, v2, Lj3/L;->p:I

    .line 30
    .line 31
    iget v3, v1, Lm4/v;->b:I

    .line 32
    .line 33
    iput v3, v2, Lj3/L;->q:I

    .line 34
    .line 35
    new-instance v3, Lj3/M;

    .line 36
    .line 37
    invoke-direct {v3, v2}, Lj3/M;-><init>(Lj3/L;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, LA3/E;

    .line 41
    .line 42
    iget v4, v0, LA3/E;->b:I

    .line 43
    .line 44
    iget-object v0, v0, LA3/E;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    const/16 v5, 0xc

    .line 49
    .line 50
    invoke-direct {v2, v3, v4, v0, v5}, LA3/E;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p1, Lk3/j;->o:LA3/E;

    .line 54
    .line 55
    :cond_0
    iget p1, v1, Lm4/v;->a:I

    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    check-cast p1, Lj3/p0;

    .line 59
    .line 60
    iget-object v0, p0, Lj3/z;->b:Lm4/v;

    .line 61
    .line 62
    invoke-interface {p1, v0}, Lj3/p0;->g(Lm4/v;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

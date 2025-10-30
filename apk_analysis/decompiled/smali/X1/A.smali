.class public final synthetic LX1/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX1/F;


# direct methods
.method public synthetic constructor <init>(LX1/F;I)V
    .locals 0

    .line 1
    iput p2, p0, LX1/A;->a:I

    iput-object p1, p0, LX1/A;->b:LX1/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LX1/A;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LX1/r;

    .line 7
    .line 8
    new-instance v1, LX1/C;

    .line 9
    .line 10
    iget-object v2, p0, LX1/A;->b:LX1/F;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v3}, LX1/C;-><init>(LX1/F;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, LX1/r;-><init>(LX1/C;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, LX1/c;

    .line 21
    .line 22
    new-instance v1, LX1/B;

    .line 23
    .line 24
    iget-object v2, p0, LX1/A;->b:LX1/F;

    .line 25
    .line 26
    invoke-direct {v1, v2}, LX1/B;-><init>(LX1/F;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, LX1/C;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v3, v2, v4}, LX1/C;-><init>(LX1/F;I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v3}, LX1/c;-><init>(LX1/B;LX1/C;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 53
    .line 54
    .line 55
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

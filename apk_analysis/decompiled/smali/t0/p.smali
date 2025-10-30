.class public final synthetic Lt0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt0/r;

.field public final synthetic c:Lf5/o;

.field public final synthetic d:Lt0/n;

.field public final synthetic e:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lt0/r;Lf5/o;Lt0/n;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p5, p0, Lt0/p;->a:I

    iput-object p1, p0, Lt0/p;->b:Lt0/r;

    iput-object p2, p0, Lt0/p;->c:Lf5/o;

    iput-object p3, p0, Lt0/p;->d:Lt0/n;

    iput-object p4, p0, Lt0/p;->e:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lt0/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/p;->b:Lt0/r;

    .line 7
    .line 8
    iget-object v1, p0, Lt0/p;->e:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lt0/p;->c:Lf5/o;

    .line 11
    .line 12
    iget-object v3, p0, Lt0/p;->d:Lt0/n;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v3, v1}, Lf5/o;->C(Lt0/r;Lt0/n;Ljava/util/ArrayList;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lt0/p;->b:Lt0/r;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lt0/p;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v2, p0, Lt0/p;->c:Lf5/o;

    .line 26
    .line 27
    iget-object v3, p0, Lt0/p;->d:Lt0/n;

    .line 28
    .line 29
    invoke-virtual {v2, v0, v3, v1}, Lf5/o;->C(Lt0/r;Lt0/n;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

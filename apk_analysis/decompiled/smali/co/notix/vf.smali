.class public final Lco/notix/vf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/uf;


# instance fields
.field public final b:Lco/notix/j3;

.field public final c:Lco/notix/y8;

.field public final d:Lco/notix/ia;


# direct methods
.method public constructor <init>(Lco/notix/j3;Lco/notix/d9;Lco/notix/ia;)V
    .locals 1

    const-string v0, "adLoaderDelegateFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/vf;->b:Lco/notix/j3;

    iput-object p2, p0, Lco/notix/vf;->c:Lco/notix/y8;

    iput-object p3, p0, Lco/notix/vf;->d:Lco/notix/ia;

    return-void
.end method
